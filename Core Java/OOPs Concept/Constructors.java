
class ConstructorDemo {
    int value;
    String name;
    // Constructor
    public ConstructorDemo() {
        System.out.println("Default Constructor called!");
        this.value = 0; // Default value
        this.name = "Default Name"; // Default name
    }
    // Parameter constructor
    public ConstructorDemo(int value, String name) {
        this.value = value;
        this.name = name;
        System.out.println("Parameter constructor called!");
    }
    // Copy constructor
    public ConstructorDemo(ConstructorDemo other) {
        this.value = other.value;
        this.name = other.name;
        System.out.println("Copy constructor called!");
    }
    // Method to display the values
    public void displayValues() {  
        System.out.println("Value: " + value + ", Name: " + name);
    }

    // Method to demonstrate constructor usage
    public void displayMessage() {
        System.out.println("This is a method in the ConstructorDemo class.");
    }
}

@SuppressWarnings("unused")
class Constructors {
    public static void main(String[] args) {
        // Using the default constructor
        ConstructorDemo demo1 = new ConstructorDemo();
        demo1.displayValues();
        
        // Using the parameterized constructor
        ConstructorDemo demo2 = new ConstructorDemo(42, "Alice");
        demo2.displayValues();
        
        // Using the copy constructor
        ConstructorDemo demo3 = new ConstructorDemo(demo2);
        demo3.displayValues();
        
        // Calling a method
        demo1.displayMessage();
    }
}