package com.akshata.programs;

import java.util.*;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show Books");
            System.out.println("6. Show Users");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1  :
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    library.addBook(new Book(id, title));
                
                case 2 :
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    library.addUser(new User(uid, name));
                
                case 3 :
                    System.out.print("Enter Book ID to issue: ");
                    library.issueBook(sc.nextInt());
               
                case 4 : 
                    System.out.print("Enter Book ID to return: ");
                    library.returnBook(sc.nextInt());
               
                case 5 : library.showBooks();
                case 6 : library.showUsers();
                case 7 : System.out.println("Exiting...");
                default : System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}

