import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Output: 3

        // Peek at the top element
        System.out.println("Top element: " + stack.peek()); // Output: 2

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}