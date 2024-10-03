class Mobile {
    String brandName;
    int price;
    // static String color = "Black";
    // static String type;

    static {
        System.out.println("Static block");
    }

    public Mobile() {
        System.out.println("Constructor");
    }
}

public class ClSt {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        // m1.brandName = "Samsung";
        // m1.price = 1000;
    }
}