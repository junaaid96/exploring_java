public class Str {
    public static void main(String a[]) {
        // String is immutable
        String s1 = "Hello"; // String literal. stored in String pool
        String s2 = "Hello";
        String s3 = new String("Hello"); // stored in heap
        String s4 = new String("Hello");

        // == operator compares the reference of the string
        System.out.println(s1 == s2); // true

        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false

        // equals method compares the content of the string
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true

        // StringBuffer and StringBuilder are mutable
        StringBuffer sb1 = new StringBuffer("Hello"); // thread safe, reason is synchronization. it means only one
                                                      // thread can access it at a time.
        StringBuilder sb2 = new StringBuilder("Hello");

        // here sb1 and sb2 are mutable, no new object is created, the same object is
        // modified.
        sb1.append(" World");
        sb2.append(" World");

        System.out.println(sb1); // Hello World
        System.out.println(sb2); // Hello World

        sb2.deleteCharAt(4);
        System.out.println(sb2);

        sb2.insert(4, "o");
        System.out.println(sb2);

        sb2.reverse();
        System.out.println(sb2);

        // StringBuilder
        StringBuilder sb3 = new StringBuilder("Hello"); // not thread safe. reason is performance. it is faster than
                                                        // StringBuffer. cause multiple threads can access it at a time.
        sb3.append(" World");

        System.out.println(sb3); // Hello World

    }
}
