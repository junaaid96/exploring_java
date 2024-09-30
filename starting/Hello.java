public class Hello {
    static int a = Integer.MAX_VALUE;
    byte b = Byte.MIN_VALUE;
    char c = 'A';

    public static void main(String arg[]) {

        double d = 1.0; // 64 bit
        float f = 1.0f; // 32 bit
        long l = 1L; // 64 bit
        short s = 1; // 16 bit
        byte b = 1; // 8 bit
        char c = 'A'; // 16 bit

        

        System.out.println("Hello World");
        System.out.println(a);
        System.out.println(new Hello().b); //because b is not declare in class so we have to create object of class to access it. if it is static then we can access it directly. because static variable is class level variable.
        System.out.println(new Hello().c);

        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(s);
        System.out.println(b);
        System.out.println(c);

    }
}