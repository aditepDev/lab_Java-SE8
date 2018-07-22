package lab2javabasic.lab1;

public class DegreeConverter {

    protected double R2C(double romer) {
        double r2c = romer / 0.80000;
        return r2c;
    }

    protected double C2R(double celsius) {
        double r2c = celsius / 0.80000;
        return r2c;
    }

    protected double C2F(double celsius) {
        double c2f = (celsius * 1.800) + 32;
        return c2f;

    }

    protected double C2K(double celsius) {
        double c2k = celsius + 273.15;
        return c2k;

    }

    protected double F2C(double fahrenheit) {
        double f2c = (fahrenheit - 32) / 1.800;
        return f2c;
    }

    protected double F2R(double fahrenheit) {
        double f2r = ((fahrenheit - 32) * 0.29167) + 7.50;
        return f2r;
    }

}

