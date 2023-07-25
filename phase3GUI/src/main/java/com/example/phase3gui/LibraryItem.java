package com.example.phase3gui;

public abstract class LibraryItem implements Comparable<LibraryItem> {
    private String title;
    private int itemId;
    private int numberOfCopies;

    public LibraryItem() {
    }

    public LibraryItem(String title, int itemId, int numberOfCopies) throws MyException {
        this.title = title;
        this.setItemId(itemId);
        this.numberOfCopies = numberOfCopies;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setItemId(int itemId) throws MyException {
        if (isValidItemId(itemId))
            this.itemId = itemId;
        else
            throw new MyException("Invalid Item ID");
    }

    public int getItemId() {
        return itemId;
    }

    // method checks if book ID is valid
    private boolean isValidItemId(int itemId) {
        if (itemId > 0)
            return true;
        throw new MyException("Invalid Item ID");
    }

    public void decrementNumberOfCopies() {
        numberOfCopies--;
    }

    public void incrementNumberOfCopies() {
        numberOfCopies++;
    }

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
        System.out.println("Number of copies: " + numberOfCopies);
    }

    public abstract boolean compareTwo(Name s, Name s2);

    @Override
    public String toString() {
        return getTitle() + "," + getItemId() + "," + getNumberOfCopies();
    }
}
