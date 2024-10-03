@FunctionalInterface
interface A {
    void info();
}

@FunctionalInterface
interface B {
    void show(int i);
}

@FunctionalInterface
interface C {
    int add(int i, int j);
}

// abstract class B implements A {
// public abstract void info();
// }

public class SAMInterface {
    public static void main(String a[]) {
        A obj;
        // obj = new A() {
        // @Override
        // public void info() {
        // System.out.println("overridden from interface with anonymous inner class");
        // }
        // };
        obj = () -> System.out.println("overridden from interface using lambda expression");
        obj.info();

        // B obj2 = (int i) -> System.out.println("in B show," + " " + i);
        B obj2 = i -> System.out.println("in B show," + " " + i);
        obj2.show(34);

        C obj3 = (i, j) -> i + j;
        System.out.println(obj3.add(5, 6));
    }
}
