public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Access elements
        System.out.println("First element: " + numbers[0]);

        // Iterate over the array
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Modify an element
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);
    }
}