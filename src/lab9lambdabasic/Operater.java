package lab9lambdabasic;

public class Operater {
    private int a;
    private int b;
    private MathOperation mathOperation;

    public Operater() {
    }

    public Operater(int a, int b, MathOperation mathOperation) {
        this.a = a;
        this.b = b;
        this.mathOperation = mathOperation;
    }

    public static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
