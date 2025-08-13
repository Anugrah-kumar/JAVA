// File: Core Java/Strings.java
// This file contains examples of string manipulation in Java.

class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Concatenation
        String str3 = str1 + " " + str2;
        System.out.println(str3); // Output: Hello World
        
        // Length
        System.out.println("Length of str3: " + str3.length()); // Output: 11
        
        // Substring
        String subStr = str3.substring(0, 5);
        System.out.println("Substring: " + subStr); // Output: Hello
        
        // Character at index
        char ch = str3.charAt(6);
        System.out.println("Character at index 6: " + ch); // Output: W
        // String comparison
        boolean isEqual = str1.equals("Hello"); 
        System.out.println("Is str1 equal to 'Hello'? " + isEqual); // Output: true
        // String to uppercase
        String upperStr = str3.toUpperCase();
        System.out.println("Uppercase str3: " + upperStr); // Output: HELLO WORLD   
        // String to lowercase
        String lowerStr = str3.toLowerCase();
        System.out.println("Lowercase str3: " + lowerStr); // Output: hello world
        // Replace characters
        String replacedStr = str3.replace("World", "Java"); 
        System.out.println("Replaced str3: " + replacedStr); // Output: Hello Java

        // Split string
        String[] words = str3.split(" ");  
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }   
        // Check if string contains a substring
        boolean contains = str3.contains("Hello");
        System.out.println("Does str3 contain 'Hello'? " + contains); // Output: true
    }
}