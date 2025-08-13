// Java program demonstrating access modifiers

public class MyAccess {
    // Public variable can be accessed from anywhere
    public int publicVariable = 100;
    // Protected variable can be accessed within the same package or subclasses
    protected int protectedVariable = 200;
    // Default variable can be accessed only within the same package
    int defaultVariable = 300;
    // Public method can be accessed from anywhere
    public void publicMethod() {
        System.out.println("Public Method");
    }

    

    // Protected method can be accessed within the same package or subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
   
    // Default method can be accessed within the same package
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // Private variable
    private int privateVariable = 42;

    // Getter for private variable
    public int getPrivateVariable() {
        return privateVariable;
    }

    // Setter for private variable
    public void setprivateVariable(int value) {
        this.privateVariable = value;
    }
}