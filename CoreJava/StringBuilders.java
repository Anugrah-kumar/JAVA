 

class StringBuilders{
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string to the StringBuilder
        sb.append(" World!");

        // Insert a string at a specific index
        sb.insert(5, ", Java");

        // Replace a substring
        sb.replace(0, 5, "Hi");
        // set a character at a specific index
        sb.setCharAt(0, '!');

        // Delete a substring
        sb.delete(2, 6);

        // Convert to String and print
        System.out.println(sb.toString());
        // Reverse the StringBuilder
        sb.reverse();
        System.out.println("Reversed: " + sb.toString());
        // Get the length of the StringBuilder
        System.out.println("Length: " + sb.length());   
        // Get the character at a specific index
        char ch = sb.charAt(0);
        System.out.println("Character at index 0: " + ch); // Output: ! 
    }
}