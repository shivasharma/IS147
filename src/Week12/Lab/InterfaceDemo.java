package Week12.Lab;

/**
 * Created by Shiva on 11/18/2015.
 */
public class InterfaceDemo {

    public static void main(String args[]) {
        //programming for interfaces not implementation
        Shape shape = new Circle();

       // call shape Draw method;
        System.out.println("Area="+shape.getArea());


        shape=new Rectangle();
        shape.draw();
        System.out.println("Area="+shape.getArea());
    }

}

//create interface with name Shape

interface Shape{

    private void draw();
   private double getArea();
}

 class Circle implements Shape {

    private double radius;

    public Circle(double r){
        this.radius = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public double getRadius(){
        return this.radius;
    }
}

 class Rectangle implemented Shape {

    private double width;
    private double height;

    public Rectangle(double w, double h){
        this.width=w;
        this.height=h;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

}