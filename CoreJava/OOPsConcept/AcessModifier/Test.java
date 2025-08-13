// Java program demonstrating access modifiers



class MyClass {
    // Public method can be accessed from anywhere
   private int privateVariable = 10;
    protected int protectedVariable = 20;
    int defaultVariable = 30;
    public int publicVariable = 40;

    // Private method can only be accessed within this class
  int getPrivateVariable() {
        return privateVariable;
    }
    void  setprivateVariable(int value) {
        this.privateVariable = value;

    }
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Protected method can be accessed within the same package or subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // Default method can be accessed only within the same package
    void defaultMethod() {
        System.out.println("Default Method");
    }
}

    // Private method can only be accessed within this class
    
    @SuppressWarnings("unused")
class Test {
    public static void main(String[] args) {
        // Creating an instance of the class
        MyClass myObject = new MyClass();
        MyAccess myAccessObject = new MyAccess();
        
        // Accessing public method
      
        // Accessing public method
        myAccessObject.publicMethod();
        // Accessing protected method
        myAccessObject.protectedMethod();
        // Accessing default method
        myAccessObject.defaultMethod();
        // Accessing public variable
        System.out.println("public variable = " + myAccessObject.publicVariable);
        // Accessing protected variable
        System.out.println("protected variable = " + myAccessObject.protectedVariable);
        // Accessing default variable
        System.out.println("default variable = " + myAccessObject.defaultVariable);
        // Accessing public method
        myObject.publicMethod();
        
        // Accessing protected method
        myObject.protectedMethod();
        // Accessing public variable
        System.out.println("public variable = " + myObject.publicVariable);
        // Accessing protected variable
        System.out.println("protected variable = " + myObject.protectedVariable);
        // Accessing default variable
        System.out.println("default variable = " + myObject.defaultVariable);
        
        // Accessing default method
        myObject.defaultMethod();
        myObject.setprivateVariable(100);
        System.out.println("private variable =" + myObject.getPrivateVariable());
        try {
            // Accessing private variable (will cause an error if uncommented)
           // System.out.println(myObject.privateVariable); // This line would cause a compilation error
        } catch (Exception e) {
            System.out.println("Cannot access private variable directly.");
        }
        
        // Accessing private method (will cause an error if uncommented)
        // myObject.privateMethod(); // This line would cause a compilation error
    }
}