
class Parent {
    public void parentMethod() {
        System.out.println("This is the parent method");
    }

    public void commonMethod() {
        System.out.println("Parent's version of common method");
    }
}

class Child extends Parent {
    public void childMethod() {
        System.out.println("This is the child method");
    }

    @Override
    public void commonMethod() {
        System.out.println("Child's version of common method");
    }
}

public class ParChild {
    public static void main(String[] args) {
        Parent obj = new Child();

        obj.parentMethod(); // Works fine
        obj.commonMethod(); // Calls the Child's version
        // obj.childMethod(); // This would cause a compilation error

        // We can cast back to Child if we need to
        if (obj instanceof Child) {
            Child childObj = (Child) obj;
            childObj.childMethod(); // Now this works
        }
    }
}
