package com.example.phase3gui;

public class Book extends LibraryItem implements Cloneable {
    private Name author;
    private String ISBN;

    // empty constructor
    public Book() {
    }

    // constructor with parameters
    public Book(String title, int itemId, int numberOfCopies, Name author, String ISBN) throws MyException {
        super(title, itemId, numberOfCopies);
        this.author = author;
        this.setISBN(ISBN);
    }

    // getters and setters
    public Name getAuthor() {
        return this.author;
    }

    public void setAuthor(Name author) {
        this.author = author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        if (isValidISBN(ISBN))
            this.ISBN = ISBN;
        else
            throw new MyException("ISBN must be 5 digits");
    }

    // method checks if ISBN is valid
    private boolean isValidISBN(String ISBN) {
        if (ISBN.length() == 5)
            return true;
        return false;
    }

    // override methods clone, equals, printInfo, compareTwo, compareTo
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book)
            return getAuthor().equals(((Book) obj).getAuthor());
        else
            return false;
    }

    // This method prints out information about a book
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }

    @Override
    public String toString() {
        return super.toString() + "," + getAuthor() + "," + getISBN();
    }

    @Override
    public boolean compareTwo(Name author, Name author2) {
        if (author.equals(author2))
            return true;
        return false;
    }

    @Override
    public int compareTo(LibraryItem o) {
        return this.ISBN.compareTo(((Book) o).getISBN());
    }

}
