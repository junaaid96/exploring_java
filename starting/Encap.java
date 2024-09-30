class Person {
    private String name;
    int age;

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
}

public class Encap {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setName("Junaid");
        p1.age = 26;

        System.out.println(p1.getName() + " " + p1.age);
    }
}