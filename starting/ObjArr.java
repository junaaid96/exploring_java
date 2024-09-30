class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class ObjArr {
    public static void main(String arg[]) {
        Student s1 = new Student(24, "Junaid");

        // way of creating an array of Student objects when there is no constructor
        // Student s2 = new Student();
        // s2.roll= 23;
        // s2.name= "Tanvir";

        Student s2 = new Student(23, "Tanvir");
        Student s3 = new Student(25, "Rahul");

        // Student students[] = { s1, s2, s3 };

        Student students[] = new Student[3]; // this is an array of Student objects, it holds 3 references to Student
                                             // objects

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student s : students) {
            System.out.println(s.roll + " " + s.name);
        }
    }
}
