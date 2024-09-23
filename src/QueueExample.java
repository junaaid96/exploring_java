import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Remove elements from the queue
        System.out.println("Removed element: " + queue.remove()); // Output: 1

        // Peek at the front element
        System.out.println("Front element: " + queue.peek()); // Output: 2

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false
    }
}