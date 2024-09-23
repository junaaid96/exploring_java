public class BinarySearchExample {
    // Binary search algorithm
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If key is greater, ignore left half
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                // If key is smaller, ignore right half
                right = mid - 1;
            }
        }

        // Key not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int key = 10;
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}