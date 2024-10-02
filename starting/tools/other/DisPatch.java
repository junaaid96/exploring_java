package tools.other;

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {

    public void show2() {
        System.out.println("in B show2");
    }

    @Override
    public void show() {
        System.out.println("in B show");
    }
}

class C extends B {
    @Override
    public void show() {
        System.out.println("in C show");
    }
}

public class DisPatch {
    public static void main(String[] args) {

        // Dynamic method dispatch/same method behave differently according to the last override until created obj.
        // A obj = new A();
        // obj.show();

        // obj = new B();
        // obj.show();

        // obj = new C();
        // obj.show();

        A obj = new C();
        obj.show();
        //obj.show2();

    }
}
