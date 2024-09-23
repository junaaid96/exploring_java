import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Try-catch block
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        // Try-catch-finally block
        Scanner scanner = null;
        try {
            File file = new File("nonexistent.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        // Try-with-resources (Java 7+)
        try (Scanner autoCloseScanner = new Scanner(new File("example.txt"))) {
            while (autoCloseScanner.hasNextLine()) {
                System.out.println(autoCloseScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
    }

    // Method that throws an exception
    public static int divideNumbers(int a, int b) throws ArithmeticException {
        return a / b;
    }
}