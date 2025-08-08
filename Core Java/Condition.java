// File: Core Java/Condition.java
// This file contains examples of conditional statements in Java.

class Condition {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Using if-else statement
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }
        // Using ternary operator
        String result = (a > b) ? "a is greater than b" : (a < b) ? "a is less than b" : "a is equal to b";
        System.out.println(result);
        // Using switch statement
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Other day");
        }
    }
}