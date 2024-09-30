class Mobile {
    String brandName;
    int price;
    static String color = "Black";
    static String type;

    static {
        type = "Smartphone";
        System.out.println("Static block is executed only once when the class is loaded.");
    } // static block is used to initialize the static variables. It is executed only
      // once when the class is loaded.

    public Mobile() {
        System.out.println("Constructor is executed every time an object is created.");
    }
}

// class loads first and once --> static block is executed only once when the
// class is loaded. --> constructor is executed every time an object is created.

public class ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile m1 = new Mobile();
        // m1.brandName = "Samsung";
        // m1.price = 10000;

        // Mobile m2 = new Mobile();
        // m2.brandName = "Apple";
        // m2.price = 50000;

        // if objects are not created then the static block will not be executed. as
        // class loader will not load the class.

        // so we use Class.class
        Class.forName("Mobile");

    }
}