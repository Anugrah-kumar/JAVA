
class BinaryNum {
    public static void main(String[] args) {
        // Example binary number
        String binaryString = "1010"; // Binary representation of 10

        // Convert binary string to decimal
        int decimalValue = Integer.parseInt(binaryString, 2);
        
        // Print the result
        System.out.println("Binary: " + binaryString + " in decimal is: " + decimalValue);
        // Convert decimal back to binary
        String binaryValue = Integer.toBinaryString(decimalValue);  
        System.out.println("Decimal: " + decimalValue + " in binary is: " + binaryValue);
    }
}