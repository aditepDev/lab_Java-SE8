package lab2javabasic.lab1;

public class DregreeTest {
    public static void main(String[] args) {
        DegreeConverter converter = new DegreeConverter();
        System.out.println("100 celsius = " + converter.C2F(100.0) + " fahrenheit.");
        System.out.println("80 romer = " + converter.R2C(80.0) + " celsius");
        System.out.println("140 fahrenheit = "+converter.F2R(140.0)+" romer");
    }
}
