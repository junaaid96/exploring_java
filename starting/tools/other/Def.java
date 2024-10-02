package tools.other;

import tools.Abc;

public class Def {

    private int a;

    public Def(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Def def = new Def(1);
        System.out.println(def.a);

        Abc abc = new Abc(2);
        System.out.println(abc.getA());
    }
}