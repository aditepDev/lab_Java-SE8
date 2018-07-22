package lab9lambdabasic;

public class testLambda {
    public static void main(String[] args) {

        //new class
        Function function = new Function();
        Operater operater = new Operater();

        System.out.println("lambda ex.1");
        //ex.1
        System.out.println("10 + 5 = " + operater.operate(10, 5, function.addition));
        System.out.println("10 - 5 = " + operater.operate(10, 5, function.subtraction));
        System.out.println("10 ^ 5 = " + operater.operate(10, 5, function.pow));
        //-------------------------------------------------------------------------------//
        //ex.2
        System.out.println("10 * 5 = " + function.multiplication.operation(10, 5));
        System.out.println("10 / 5 = " + function.division.operation(10, 5));
        ///-----------------------------------------------------------------------------///

        System.out.println("lambda ex.2");
        //lambda ex.2
        MathOperation moc = null;
        moc = (int a, int b) -> a + b;
        System.out.println("10 + 5 = " + moc.operation(10, 5));
        moc = (int a, int b) -> a - b;
        System.out.println("10 - 5 = " + moc.operation(10, 5));
        moc = (int a, int b) -> a * b;
        System.out.println("10 x 5 = " + moc.operation(10, 5));
        moc = (int a, int b) -> a / b;
        System.out.println("10 / 5 = " + moc.operation(10, 5));

    }


}
