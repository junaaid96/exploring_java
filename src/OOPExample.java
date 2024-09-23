// Class definition
class Person {
    // Instance variables (attributes)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

// Main class
public class OOPExample {
    public static void main(String[] args) {
        // Creating objects
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Calling methods
        person1.introduce();
        person2.introduce();

        // Using getter and setter
        System.out.println(person1.getName() + " is changing age...");
        person1.setAge(31);
        person1.introduce();
    }
}