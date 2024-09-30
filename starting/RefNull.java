class Car {
    String name; // instance variable

    Car(String name) { // here name is local variable
        this.name = name; // this.name refers to instance variable
    }
}

public class RefNull {
    public static void main(String[] args) {
        Car c1, c2; // c1 and c2 are reference variables
        c1 = new Car("BMW"); // c1 refers to object of Car
        c2 = new Car("Audi"); // c2 refers to object of Car

        System.out.println(c1.name); // BMW
        System.out.println(c2.name); // Audi

        c1 = c2; // c1 now refers to object of c2
        System.out.println(c1.name); // Audi

        c2 = null; // c2 now refers to null
        // System.out.println(c2.name); // NullPointerException

        System.out.println(c1.name); // Audi
    }

}