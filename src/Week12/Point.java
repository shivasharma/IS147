package Week12;

/**
 * Created by Shiva on 11/18/2015.
 */
public class Point implements Triangle {

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
       p.AreaofTriangle ();
        p.print();
    }

    @Override
    public void AreaofTriangle() {
        System.out.println ("Area of a triange is 1/2* base*height");
    }
}


interface Shape {

    public double area();
    public double volume();
}

interface Triangle extends Shape {

    public void AreaofTriangle(); // public static by default
}