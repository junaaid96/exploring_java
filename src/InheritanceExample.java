// Base class (superclass)
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Derived class (subclass)
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    // Additional method
    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}

// Another derived class
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow! Meow!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Polymorphism
        Animal animal1 = new Dog("Buddy");
        Animal animal2 = new Cat("Whiskers");

        animal1.makeSound(); // Calls Dog's makeSound()
        animal2.makeSound(); // Calls Cat's makeSound()

        // Casting to access specific subclass method
        if (animal1 instanceof Dog) {
            ((Dog) animal1).fetch();
        }
    }
}