package lab7abstract;

public class TestGraphics {
    public static void main(String[] args) {
        MyGraphics cir = new MyCircle(5, 5, 10);
        MyGraphics rec = new MyRectangle(50, 50, 5, 10);

        System.out.println("area of Circle = " + cir.findArea());
        System.out.println("Circle Location (x,y)" + cir.getX() + "," + cir.getY());

        System.out.println("area of Rec = " + rec.findArea());
        System.out.println("Rectangle Location (x,y)" + rec.getX() + "," + rec.getY());

   //     cir.move(cir,50,50);
        MyGraphics.move(cir,20,19);
        System.out.println("Circle Location (x,y)  = " + cir.getX() + "," + cir.getY());

  //      rec.move(64,43);
        MyGraphics.move(rec,213,192);
        System.out.println("Rectangle Location (x,y) = " + rec.getX() + "," + rec.getY());
    }
}
