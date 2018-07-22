package lab7abstract;

public class MyRectangle extends MyGraphics {
    private double width;
    private double height;

    @Override
    public void draw() {

    }

    @Override
    public double findArea() {

        return getWidth() * getHeight();
    }

    public MyRectangle() {
    }

    public MyRectangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
