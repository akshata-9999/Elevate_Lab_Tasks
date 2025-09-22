package com.akshata.tasks;

import java.util.Scanner;

public class ConsoleCalculator {
	
	    public static double add(double a, double b) {
	        return a + b;
	    }

	    public static double subtract(double a, double b) {
	        return a - b;
	    }

	    public static double multiply(double a, double b) {
	        return a * b;
	    }

	    public static double divide(double a, double b) {
	        if (b == 0) {
	            System.out.println("Cannot divide by zero!");
	            return 0;
	        }
	        return a / b;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        boolean running = true;

	        while (running) {
	            System.out.println("*** Simple Calculator ***");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();

	            if (choice == 5) {
	                running = false;
	                System.out.println("Exiting...Bye");
	                break;
	            }

	            System.out.print("Enter first number: ");
	            double num1 = sc.nextDouble();
	            System.out.print("Enter second number: ");
	            double num2 = sc.nextDouble();

	            double result;
	            switch (choice) {
	                case 1:
	                    result = add(num1, num2);
	                    break;
	                case 2:
	                    result = subtract(num1, num2);
	                    break;
	                case 3:
	                    result = multiply(num1, num2);
	                    break;
	                case 4:
	                    result = divide(num1, num2);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again!");
	                    continue;
	            }

	            System.out.println("Result: " + result);
	        }
	    }
}
