package com.akshata.programs;

import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId && !b.isIssued()) {
                b.issue();
                System.out.println("Book issued: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId && b.isIssued()) {
                b.returnBook();
                System.out.println("Book returned: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }

    public void showBooks() {
        books.forEach(System.out::println);
    }

    public void showUsers() {
        users.forEach(System.out::println);
    }
}

