package com.example.phase3gui;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Library {
    private String libraryName;
    private ObservableList<LibraryItem> listItems;

    public Library() {
        listItems = FXCollections.observableArrayList();
    }

    public Library(String libraryName) {
        this.libraryName = libraryName;
        listItems = FXCollections.observableArrayList();

    }

    public String getLibraryName() {
        return this.libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public ObservableList<LibraryItem> getListItems() {
        return this.listItems;
    }

    public void setListItems(ObservableList<LibraryItem> listItems) {
        this.listItems = listItems;
    }
//add a book to the list
    public void addLibraryItem(String title, int itemId, int numberOfCopies, Name author, String ISBN)
            throws IllegalArgumentException {
        if (!listItems.contains(searchForItem(ISBN))) {
            Book book = new Book(title, itemId, numberOfCopies, author, ISBN);
            listItems.add(book);
        } else {
            throw new IllegalArgumentException("Book already contains");

        }
    }
    // sort the library items
    public LibraryItem sortLibrary() {
        Collections.sort(listItems);
        for (LibraryItem list : listItems) {
            return list;
        }
        return null;
    }
    //add a cd
    public void addLibraryItem(int trackNo, int itemId, int numberOfCopies, Name composer, String title)
            throws IllegalAccessException {
        listItems.add(new CD(title, itemId, numberOfCopies, composer, trackNo));
    }
    // Remove an item from the library based on its ISBN
    public boolean removeItem(String ISBN) {
        LibraryItem itemToRemove = searchForItem(ISBN);
        if (itemToRemove != null) {
            listItems.remove(itemToRemove);
            return true;
        }
        throw new IllegalArgumentException("Item not found");
    }
    // Search for an item in the library based on its ISBN

    public LibraryItem searchForItem(String ISBN) {
        for (LibraryItem libraryItem : listItems) {
            if (((Book) libraryItem).getISBN().equalsIgnoreCase(ISBN)) {
                return libraryItem;
            }
        }
        return null;
    }
    // Update the details of a library item based on its ISBN
    public boolean updateLibraryItem(String ISBN, String newTitle, int newItemId, int newNumberOfCopies, Name newAuthor)
            throws IllegalAccessException {
        Book book = (Book) searchForItem(ISBN);
        if (book != null) {
            listItems.remove(book);
            book.setTitle(newTitle);
            book.setAuthor(newAuthor);
            book.setItemId(newItemId);
            book.setNumberOfCopies(newNumberOfCopies);
            listItems.add(book);
            return true;
        } else {
            throw new IllegalAccessException("Item not found");
        }
    }
    // Save the library items to a file
    public void save() {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream("LibraryFileOutput.txt", true))) {
            for (LibraryItem item : listItems) {
                writer.println(item.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Read library items from a file and add them to the library
    public void readFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookDetails = line.replaceAll("\\[|\\]", "").split(",");
                String title = bookDetails[0].trim();
                int itemId = Integer.parseInt(bookDetails[1].trim());
                int numberOfCopies = Integer.parseInt(bookDetails[2].trim());
                String author = bookDetails[3].trim();
                String ISBN = bookDetails[4].trim();
                addLibraryItem(title, itemId, numberOfCopies, new Name(author), ISBN);
            }
        }
    }
}
