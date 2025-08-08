
class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b)); // Output: 15
        System.out.println("Subtraction: " + (a - b)); // Output: 5
        System.out.println("Multiplication: " + (a * b)); // Output: 50
        System.out.println("Division: " + (a / b)); // Output: 2
        System.out.println("Modulus: " + (a % b)); // Output: 0

        // Relational Operators
        System.out.println("Is a greater than b? " + (a > b)); // Output: true
        System.out.println("Is a less than b? " + (a < b)); // Output: false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y)); // Output: false
        System.out.println("Logical OR: " + (x || y)); // Output: true

        // Assignment Operators
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("After assignment, c = " + c); // Output: 25

        // Unary Operators
        int d = 10;
        System.out.println("Pre-increment: " + (++d)); // Output: 11
        System.out.println("Post-increment: " + (d++)); // Output: 11, d becomes 12 after this line
    }
}