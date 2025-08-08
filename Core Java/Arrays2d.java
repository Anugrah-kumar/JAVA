// File: Core Java/Arrays2d.java
// This file contains examples of 2D arrays in Java.

class Arrays2d {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D array
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[j] + " ");
            }
            System.out.println();
        }
        // Modify an element in the 2D array
        array[1][1] = 10;      
        System.out.println("Modified element at (1, 1): " + array[1][1]);
        // Print the modified 2D array
        System.out.println("Modified 2D array:");   
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[j] + " ");
            }
            System.out.println();
        }
    }
}