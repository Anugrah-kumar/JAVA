class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}   
class Dog extends Animal {
    void bark() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Meow!");
    }
}   


@SuppressWarnings("unused")
class InheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog dog = new Dog();
        dog.bark(); // Output: Woof!
        dog.eat();  // Output: Eating...
        
        // Create an object of the superclass
        Animal animal = new Animal();
        animal.eat(); // Output: Eating...
     
     Cat cat = new Cat();
        cat.meow(); // Output: Meow!
        cat.eat();  // Output: Eating...
        
        // Demonstrating polymorphism
        Animal myDog = new Dog();
        myDog.eat(); // Output: Eating...
        // myDog.bark(); // This line would cause a compile-time error since bark() is not in Animal class
    }
}