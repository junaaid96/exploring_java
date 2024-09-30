// Define an interface with method declarations
interface CalculatorOperations {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}

// Define an abstract class that implements the interface
abstract class AbstractCalculator implements CalculatorOperations {
    // Provide implementation for some methods
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    // Abstract methods to be implemented by the concrete class
    public abstract int mul(int a, int b);
    public abstract int div(int a, int b);
}

// Define a concrete class that extends the abstract class
class Calculator extends AbstractCalculator {
    // Implement the remaining methods
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

public class Calc {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition: " + c.add(10, 20));
        System.out.println("Subtraction: " + c.sub(10, 20));
        System.out.println("Multiplication: " + c.mul(10, 20));
        System.out.println("Division: " + c.div(10, 2));
    }
}