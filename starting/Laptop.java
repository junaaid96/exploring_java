enum LaptopModel {
    Macbook(2500), XPS(3200), Surface(), ThinkPad(1300);

    private int price;

    LaptopModel() {
        price = 0; // default value
    }

    LaptopModel(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int setPrice(int price) {
        return this.price = price;
    }
}

public class Laptop {
    public static void main(String[] args) {

        LaptopModel.Macbook.setPrice(5000);

        for (LaptopModel model : LaptopModel.values()) {
            System.out.println(model + ": $" + model.getPrice());
        }
    }
}