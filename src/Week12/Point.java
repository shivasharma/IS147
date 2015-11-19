package Week12;

/**
 * Created by Shiva on 11/18/2015.
 */
public class Point implements Shape {

    static int x, y;
    public Point() {
        x = 10;
        y = 5;
    }
    public double area() {
        return 0;
    }
    public double volume() {
        return 0;
    }
    public static void print() {
        System.out.println("point: " + x + "," + y);
    }
    public static void main(String args[]) {
        Point p = new Point();
        p.print();
    }
}


interface Shape {

    public double area();
    public double volume();
}