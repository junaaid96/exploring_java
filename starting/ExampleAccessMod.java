public class ExampleAccessMod {
    // Default access modifier
    int defaultVar = 10;

    // Private access modifier
    private int privateVar = 20;

    // Public access modifier
    public int publicVar = 30;

    // Protected access modifier
    protected int protectedVar = 40;

    // Default access method
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // Private access method
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // Public access method
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Protected access method
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public static void main(String[] args) {
        ExampleAccessMod example = new ExampleAccessMod();

        // Accessing variables
        System.out.println("Default Variable: " + example.defaultVar);
        System.out.println("Private Variable: " + example.privateVar); // Accessible within the same class
        System.out.println("Public Variable: " + example.publicVar);
        System.out.println("Protected Variable: " + example.protectedVar);

        // Accessing methods
        example.defaultMethod();
        example.privateMethod(); // Accessible within the same class
        example.publicMethod();
        example.protectedMethod();
    }
}