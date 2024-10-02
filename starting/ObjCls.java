
class A {
    private String name;
    private int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "A [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }

    // @Override // comparing the values of object - not a good way
    // public boolean equals(A that) {
    // return this.name.equals(that.name) && this.age == that.age;

    // }

}

public class ObjCls {
    public static void main(String arg[]) {
        A obj = new A("Junaid", 26);
        A obj2 = new A("Junaid", 26);

        // System.out.println("1: " + obj + " " + "2: " + obj2);

        boolean res = obj == obj2;
        boolean res2 = obj.equals(obj2);

        int val = 50, val2 = 50;
        boolean res3 = val == val2;

        System.out.println(obj2.toString());

        // System.out.println(res);
        System.out.println(res2);

        // System.out.println(res3);

    }

}
