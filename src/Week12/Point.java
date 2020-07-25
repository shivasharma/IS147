package Week12;


interface Shape {

    double area();

    double volume();
}


interface Triangle extends Shape {

    void AreaofTriangle(); // public static by default
}

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

    public static void main(String[] args) {
        Point p = new Point();
        p.AreaofTriangle();
        print();
    }

    @Override
    public void AreaofTriangle() {
        System.out.println ("Area of a triange is 1/2* base*height");
    }
}