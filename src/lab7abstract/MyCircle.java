package lab7abstract;

public class MyCircle extends MyGraphics {
    private double radius;

    @Override
    public void draw() {

    }

    @Override
    public double findArea() {
        return (Math.PI) * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public MyCircle() {
    }

    public MyCircle(double radius) {
        this.radius = radius;
    }

    public MyCircle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }
}
