package lab9lambdabasic;

public class testLambda {
    public static void main(String[] args) {

        //new class
        Function function = new Function();
        Operater operater = new Operater();

        //ex.1
        System.out.println("10 + 5 = " + operater.operate(10, 5,function.addition));
        System.out.println("10 + 5 = " + operater.operate(10, 5,function.subtraction));
        //-------------------------------------------------------------------------------//
        //ex.2
        System.out.println("10 + 5 = " + function.multiplication.operation(10, 5));
        System.out.println("10 + 5 = " + function.division.operation(10, 5));
        ///-----------------------------------------------------------------------------///

    }


}
