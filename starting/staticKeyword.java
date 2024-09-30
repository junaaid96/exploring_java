class Mobile {
    String brandName;
    int price;
    static String color = "Black"; // static variable is shared among all the objects of the class. It is
                                   // initialized only once at the start of the execution. it can be used without
                                   // creating an object.
    static String type;

    public static void changeColor() {
        color = "Blue";
    }

    static {
        type = "Smartphone";
        System.out.println("Static block is executed only once when the class is loaded.");
    } // static block is used to initialize the static variables. It is executed only
      // once when the class is loaded.

    public Mobile() {
        System.out.println("Constructor is executed every time an object is created.");
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brandName = "Samsung";
        m1.price = 10000;

        Mobile m2 = new Mobile();
        m2.brandName = "Apple";
        m2.price = 50000;

        System.out.println(m1.brandName + " " + m1.price + " " + m1.color);
        System.out.println(m2.brandName + " " + m2.price + " " + m2.color);

        Mobile.color = "White"; // changing the static variable. it will be reflected in all the objects of the
                                // class.

        System.out.println(m1.brandName + " " + m1.price + " " + m1.color);
        System.out.println(m2.brandName + " " + m2.price + " " + m2.color);

        Mobile.changeColor(); // calling the static method
        System.out.println(m1.brandName + " " + m1.price + " " + m1.color);
    }
}
