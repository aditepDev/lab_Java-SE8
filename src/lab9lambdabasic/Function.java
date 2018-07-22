package lab9lambdabasic;

public  class Function {
    //// Lambda
    MathOperation addition = (int a, int b) -> a + b;

    MathOperation subtraction = (a, b) -> a - b;

    MathOperation multiplication = (int a, int b) -> {
        return a * b;
    };

    MathOperation division = (int a, int b) -> a / b;

    MathOperation pow = (int a, int b) -> (int) Math.pow(a,b);

}
