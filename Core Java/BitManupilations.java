// File: Core Java/BitManipulations.java
// This file contains examples of bit manipulation in Java.


class BitManipulations {
    public static void main(String[] args) {
        // Example of bit manipulation in Java
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Bitwise AND
        int andResult = a & b; // 0001 in binary, which is 1 in decimal
        System.out.println("AND Result: " + andResult);

        // Bitwise OR
        int orResult = a | b; // 0111 in binary, which is 7 in decimal
        System.out.println("OR Result: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // 0110 in binary, which is 6 in decimal
        System.out.println("XOR Result: " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // Inverts all bits of a
        System.out.println("NOT Result: " + notResult);
        // Left shift
        int leftShiftResult = a << 1; // 1010 in binary, which is 10 in decimal
        System.out.println("Left Shift Result: " + leftShiftResult);        
        // Right shift
        int rightShiftResult = a >> 1; // 0010 in binary, which is 2 in decimal
        System.out.println("Right Shift Result: " + rightShiftResult);
        // Unsigned right shift
        int unsignedRightShiftResult = a >>> 1; // 0010 in binary, which is 2 in decimal
        System.out.println("Unsigned Right Shift Result: " + unsignedRightShiftResult); 
        // Check if a bit is set
        int bitPosition = 2; // Check the 3rd bit (0-indexed)
        boolean isBitSet = (a & (1 << bitPosition)) != 0;       
        System.out.println("Is bit " + bitPosition + " set in " + a + "? " + isBitSet);
        // Count number of set bits (Hamming weight)
        int countSetBits = Integer.bitCount(a); // Counts the number of 1s
        System.out.println("Number of set bits in " + a + ": " + countSetBits);
        // Swap two numbers using bitwise XOR
        int x = 10, y = 20;
        System.out.println("Before Swap: x = " + x + ", y = " +
    y);
        x = x ^ y; // Step 1: x now holds the XOR of x and y
        y = x ^ y; // Step 2: y now holds the original value of x
        x = x ^ y; // Step 3: x now holds the original value of y
        System.out.println("After Swap: x = " + x + ", y = " + y);
        // Check if a number is a power of two
        int number = 16; // Example number
        boolean isPowerOfTwo = (number > 0) && ((number & (number - 1)) == 0);
        System.out.println(number + " is a power of two: " + isPowerOfTwo);
        // Find the position of the rightmost set bit      
        int rightmostSetBitPosition = Integer.numberOfTrailingZeros(a);
        System.out.println("Position of rightmost set bit in " + a + ": " + rightmostSetBitPosition);
        // Clear the rightmost set bit         
        int clearedRightmostSetBit = a & (a - 1); // Clears the rightmost set bit
        System.out.println("Cleared rightmost set bit of " + a + ": " + clearedRightmostSetBit);
        // Set a specific bit  
        int bitToSet = 1; // Set the 2nd bit (0-indexed)
        int setBitResult = a | (1 << bitToSet); // Sets the specified bit
        System.out.println("Set bit " + bitToSet + " in " + a + ": " + setBitResult);
        // Toggle a specific bit   
        int bitToToggle = 1; // Toggle the 2nd bit (0-indexed)
        int toggleBitResult = a ^ (1 << bitToToggle); // Toggles the specified bit
        System.out.println("Toggle bit " + bitToToggle + " in " + a + ": " + toggleBitResult);
        // Count the number of bits needed to represent a number    
        int bitsNeeded = Integer.SIZE - Integer.numberOfLeadingZeros(a);
        System.out.println("Number of bits needed to represent " + a + ": " + bitsNeeded);
        // Rotate bits to the left  
        int rotateLeftResult = (a << 1) | (a >>> (Integer.SIZE - 1)); // Rotate left by 1
        System.out.println("Rotate left " + a + ": " + rotateLeftResult);
        // Rotate bits to the right
        int rotateRightResult = (a >>> 1) | (a << (Integer.SIZE - 1)); // Rotate right by 1
        System.out.println("Rotate right " + a + ": " + rotateRightResult);
    }
}
