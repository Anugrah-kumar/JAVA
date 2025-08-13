
class TestOverriding {
    public void display() {
        System.out.println("Display method in parent class");
    }
}
class ChildOverridingDemo extends TestOverriding {
    @Override
    public void display() {
        System.out.println("Display method in child class");
    }
}

@SuppressWarnings("unused")
class OverridingDemo {
    public static void main(String[] args) {
       TestOverriding parent = new TestOverriding();
        parent.display(); // Calls parent class method

        ChildOverridingDemo child = new ChildOverridingDemo();
        child.display(); // Calls child class method

        TestOverriding polymorphicReference = new ChildOverridingDemo();
        polymorphicReference.display(); // Calls child class method due to overriding
    }
}