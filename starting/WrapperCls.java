interface A {
    int a = 10; // public static final int a = 10;

    void show();

    void info();
}

class B implements A {
    public void show() {
        System.out.println("Show method");
    }

    public void info() {
        System.out.println("Info method");
    }
}

public class WrapperCls {

    public static void main(String arg[]) {
        Integer var1 = 43;

        System.out.println(var1);

        System.out.println(A.a); // direclty access the variable of interface

        A obj = new B();

        obj.show();

        obj.info();
    }
}
