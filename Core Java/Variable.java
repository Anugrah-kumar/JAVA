// File: Core Java/Variable.java
// This file contains examples of Variable in Java.

class Variable {
    public static void main(String[] args) {
        // Declare a variable
        int myNumber;
        String myString;
        boolean myBoolean; 
        double myDouble;
        char myChar;
        myString = "Hello, Java!";
        myBoolean = true;
        myDouble = 3.14;
        myChar = 'A';
        // Print the values of the variables
        System.out.println("String value: " + myString);
        System.out.println("Boolean value: " + myBoolean);
        System.out.println("Double value: " + myDouble);       
        System.out.println("Character value: " + myChar);
        // Assign a value to the variable
        myNumber = 10;

        // Print the value of the variable
        System.out.println("The value of myNumber is: " + myNumber);

        // Reassign a new value to the variable
        myNumber = 20;
        myString = "Java Programming";
        myBoolean = false;

        myDouble = 6.28;   
        myChar = 'B';
        // Print the reassigned values
        System.out.println("The new value of myString is: " + myString);    
        System.out.println("The new value of myBoolean is: " + myBoolean);
        System.out.println("The new value of myDouble is: " + myDouble);
        System.out.println("The new value of myChar is: " + myChar);

        // Print the new value of the variable
        System.out.println("The new value of myNumber is: " + myNumber);
    }
}