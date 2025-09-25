package com.akshata.programs;

import java.util.*;

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=== Student Record Management ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1  :
                     addStudent();
                case 2 : 
                	viewStudents();
                case 3 : 
                	updateStudent();
                case 4  : 
                	deleteStudent();
                case 5 : 
                	System.out.println("Exiting...");
                default :
                	System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(id, name, marks));
        System.out.println("Student added!");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
        } else {
            students.forEach(System.out::println);
        }
    }

    private static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                sc.nextLine();
                System.out.print("Enter new Name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new Marks: ");
                s.setMarks(sc.nextDouble());
                System.out.println("Record updated!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        students.removeIf(s -> s.getId() == id);
        System.out.println("Record deleted (if found).");
    }
}

