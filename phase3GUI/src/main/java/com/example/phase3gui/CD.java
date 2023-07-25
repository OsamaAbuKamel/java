package com.example.phase3gui;

public class CD extends LibraryItem implements Cloneable {
    private int trackNo;
    private Name composer;

    public CD() {
    }

    public CD(String title, int itemId, int numberOfCopies, Name composer, int trackNo) {
        super(title, itemId, numberOfCopies);
        this.setTrackNo(trackNo);
        this.composer = composer;
    }

    public int getTrackNo() {
        return this.trackNo;
    }

    public void setTrackNo(int trackNo) {
        if (isValidTrackNo(trackNo))
            this.trackNo = trackNo;
        else
            throw new MyException("Track No must be 7 digits");
    }

    public Name getComposer() {
        return this.composer;
    }

    public void setComposer(Name composer) {
        this.composer = composer;
    }

    private boolean isValidTrackNo(int trackNo) {
        return String.valueOf(trackNo).length() == 7;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CD) {
            CD cd = (CD) obj;
            if (getComposer().equals(cd.getComposer())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Track No: " + getTrackNo());
        System.out.println("Composer: " + getComposer());
    }

    @Override
    public boolean compareTwo(Name composer, Name composer2) {
        if (composer.equals(composer2)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "," + getComposer() + "," + getTrackNo();
    }

    @Override
    public int compareTo(LibraryItem cd1) {
        CD cd = (CD) cd1;
        if (cd.getTrackNo() > getTrackNo()) {
            return 1;
        } else if (cd.getTrackNo() < getTrackNo()) {
            return -1;
        } else {
            return 0;
        }
    }
}
