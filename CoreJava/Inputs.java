
class Inputs {
    public static void main(String[] args) {
        try ( // Example of reading input from the console
                java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
            // Example of reading a string input
            System.out.print("Enter a string: ");
            String inputString = scanner.next();
            System.out.println("You entered: " + inputString);
            // Example of reading a line of text
            System.out.print("Enter a line of text: ");
            scanner.nextLine(); // Consume the newline character left by nextInt()
            String line = scanner.nextLine();
            System.out.println("You entered: " + line);
            // Example of reading a double input
            System.out.print("Enter a decimal number: ");
            double decimalNumber = scanner.nextDouble();
            System.out.println("You entered: " + decimalNumber);
            // Example of reading a boolean input
            System.out.print("Enter true or false: ");
            boolean boolValue = scanner.nextBoolean();
            System.out.println("You entered: " + boolValue);
            // Example of reading a character input
            System.out.print("Enter a character: ");
            char charValue = scanner.next().charAt(0);
            System.out.println("You entered: " + charValue);
            // Example of reading a long input
            System.out.print("Enter a long number: ");
            long longValue = scanner.nextLong();
            System.out.println("You entered: " + longValue);
            // Example of reading a float input
            System.out.print("Enter a float number: ");
            float floatValue = scanner.nextFloat();
            System.out.println("You entered: " + floatValue);
            // Example of reading a byte input
            System.out.print("Enter a byte value: ");
            byte byteValue = scanner.nextByte();
            System.out.println("You entered: " + byteValue);
            // Example of reading a short input
            System.out.print("Enter a short value: ");
            short shortValue = scanner.nextShort();
            System.out.println("You entered: " + shortValue);
            // Example of reading a line with spaces
            System.out.print("Enter a line with spaces: ");
            scanner.nextLine(); // Consume the newline character left by nextShort()
            String lineWithSpaces = scanner.nextLine();
            System.out.println("You entered: " + lineWithSpaces);
            // Example of reading multiple inputs in a single line
            System.out.print("Enter two numbers separated by space: ");
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            System.out.println("You entered: " + firstNumber + " and " + secondNumber);
            // Close the scanner
        }
    }
}