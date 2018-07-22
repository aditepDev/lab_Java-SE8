package lab5static;

public class TaxUtil {
    private static double val = 0.07;
    private static double wht = 0.03;

    public static double calVat(double amt) {
        return amt * val;
    }

    public static double calIncludeVat(double amt) {
        return amt + (amt * val);
    }

    public static double calWHT(double amt) {
        return (amt * wht);
    }
}
