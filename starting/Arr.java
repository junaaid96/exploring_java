public class Arr {
    public static void main(String[] args) {
        int[] arr1, arr2; // arr1 and arr2 are reference variables
        arr1 = new int[3]; // arr1 refers to array of int with 3 elements
        arr2 = new int[3]; // arr2 refers to array of int

        // statically initializing array elements
        int num[] = { 1, 2, 3, 4, 5 };

        // dynamically initializing array elements
        int num1[] = new int[5]; // all elements are initialized to 0 by default

        // inserting elements using for loop
        for (int i = 0; i < num1.length; i++) {
            num1[i] = i + 5;
        }

        // accessing using for loop
        for (int i = 0; i < num.length; i++) {
            System.out.println(num1[i]);
        }

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        arr2[0] = 40;
        arr2[1] = 50;
        arr2[2] = 60;

        System.out.println(arr1[0]); // 10
        System.out.println(arr2[0]); // 40

        arr1 = arr2; // arr1 now refers to array of arr2
        System.out.println(arr1[0]); // 40

        arr2 = null; // arr2 now refers to null
        // System.out.println(arr2[0]); // NullPointerException

        System.out.println(arr1[0]); // 40
    }
}
