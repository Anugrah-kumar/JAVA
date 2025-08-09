
class DemoClass {
    // This class is a demonstration of a simple Java class.
    
    // Attributes (fields)
    int value;

    // Constructor
    DemoClass(int value) {
        this.value = value;
    }

    // Method to display the value
    void displayValue() {
        System.out.println("Value: " + value);
    }

   
}
class ClassesAndObjects {
    // This class demonstrates the concept of classes and objects in Java.
    
    // Attributes (fields)
    String name;
    int age;

    // Constructor
    ClassesAndObjects(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of the class
        ClassesAndObjects person = new ClassesAndObjects("Alice", 30);
        
        // Displaying the information
        person.displayInfo();
        // Creating an object of the class
        DemoClass demo = new DemoClass(10);
        
        // Displaying the value
        demo.displayValue();
    }
}