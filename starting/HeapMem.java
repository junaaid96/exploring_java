public class HeapMem {
    public static void main(String[] args) {
        // Step 1: New objects in Eden space (Young Generation)
        Car c1 = new Car("Andrew"); // Object c1 created in Eden
        Car c2 = new Car("Gabriel"); // Object c2 created in Eden

        // Step 2: Minor GC might happen here, if Eden fills up.
        // Step 3: Objects might be moved to Survivor Spaces
        for (int i = 0; i < 10000; i++) {
            Car tempCar = new Car("Temporary"); // Temporary objects created and destroyed
        }

        // Step 4: c1 and c2 are still reachable, so they might be promoted to Old
        // Generation
        // Step 5: Long-lived object promoted to Old Generation
        Car longLivedCar = new Car("Long-Lived"); // This object may be promoted to Old Generation
    }
}