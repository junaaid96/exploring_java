class Computer {
    public String category;
    public String brand;
    public int price;

    public Computer(String category, String brand, int price) {
        this.category = category;
        this.brand = brand;
        this.price = price;
    }

    public void info() {
        System.out.println(
                "Category: " + this.category + "; " + "Brand: " + this.brand + "; " + "Price: " + this.price + ";");
    }
}

class Laptop extends Computer {

    public Laptop(String brand, int price) {
        super("Laptop", brand, price);
    }
}

public class Demo {
    public static void main(String arg[]) {
        Laptop laptop1 = new Laptop("Lenovo Legion", 1500);
        laptop1.info();

        System.out.println(laptop1); //everytime, print object, it call the toString method. laptop1.toString()
    }
}
