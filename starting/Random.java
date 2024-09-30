interface CalcOps {
    int sum(int x, int y);
    int multi(int x, int y);
}

abstract class AbsCalculator implements CalcOps {
    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public abstract int multi(int x, int y);
}

class Calculator extends AbsCalculator {
    @Override
    public int multi(int x, int y) {
        return x * y;
    }
}

public class Random {
    public static void main(String arg[]) {
        Calculator calc1 = new Calculator();

        System.out.println(calc1.sum(34, 90));
        System.out.println(calc1.multi(45, 5));
    }
}
