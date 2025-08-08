// File: Core Java/Loops.java
// This file contains examples of loops in Java.

class Loops {
    public static void main(String[] args) {
        // For loop example
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While loop example
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // Do-while loop example
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k < 5);
        // Enhanced for loop example
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        // Nested loop example
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                System.out.println("Nested loop iteration: " + m + ", " + n);
            }
        }
        // Break statement example
        for (int p = 0; p < 10; p++) {
            if (p == 5) {
                System.out.println("Breaking at p = " + p);
                break; // Exit the loop when p is 5
            }
            System.out.println("Looping: " + p);
        }
        // Continue statement example
        for (int q = 0; q < 10; q++) {
            if (q % 2 == 0) {
                System.out.println("Skipping even number: " + q);
                continue; // Skip the rest of the loop for even numbers
            }
            System.out.println("Odd number: " + q);
        }   
        // Labeled break example
        outerLoop: for (int r = 0; r < 3; r++) {
            for (int s = 0; s < 3; s++) {
                if (s == 1) {
                    System.out.println("Breaking out of outer loop at r = " + r + ", s = " + s);
                    break outerLoop; // Break out of the outer loop
                }
                System.out.println("Labeled loop iteration: " + r + ", " + s);
            }
        }
        // Labeled continue example
        labeledContinue: for (int t = 0; t < 3; t++) {
            for (int u = 0; u < 3; u++) {
                if (u == 1) {
                    System.out.println("Continuing to next iteration of outer loop at t = " + t + ", u = " + u);
                    continue labeledContinue; // Continue to the next iteration of the outer loop
                }
                System.out.println("Labeled continue iteration: " + t + ", " + u);
            }
        }
        
    }
}