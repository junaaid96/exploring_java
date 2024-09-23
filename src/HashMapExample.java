import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Access a value by key
        System.out.println("Alice's age: " + map.get("Alice")); // Output: 30

        // Iterate over the HashMap
        System.out.println("All entries:");
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a key exists
        System.out.println("Is Bob in the map? " + map.containsKey("Bob")); // Output: true

        // Remove a key-value pair
        map.remove("Charlie");
        System.out.println("Is Charlie in the map? " + map.containsKey("Charlie")); // Output: false
    }
}