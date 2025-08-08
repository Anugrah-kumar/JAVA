// File: Core Java/Methods.java
// This file contains examples of methods in Java.

class Methods {
    public static void main(String[] args) {
        // Calling the method to print a message
        printMessage();
        // calling the method to add two numbers
        int sum = addNumbers(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum);   
    
    }

    // Method to print a message
    public static void printMessage() {
        System.out.println("This is a method in Java.");
    }
    // Method to add two numbers and return the result
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}