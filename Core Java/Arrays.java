// File: Core Java/Arrays.java
// This file contains examples of arrays in Java.

class Arrays {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array length: " + numbers.length);
        // Print the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element in the array
        numbers[2] = 10;
        System.out.println("Modified element at index 2: " + numbers[2]);
        // Print the modified array
        System.out.print("Modified array: ");  
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}