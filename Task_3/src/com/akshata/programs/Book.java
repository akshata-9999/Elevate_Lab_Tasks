package com.akshata.programs;

public class Book {
    private int bookId;
    private String title;
    private boolean isIssued;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isIssued = false;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public boolean isIssued() { return isIssued; }
    public void issue() { this.isIssued = true; }
    public void returnBook() { this.isIssued = false; }

    @Override
    public String toString() {
        return "BookID: " + bookId + ", Title: " + title + ", Issued: " + isIssued;
    }
}

