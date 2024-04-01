class  Car{

    public String model;
    public String color;
    public int seats;
  
   public Car(){
     System.out.println("In Constructor");
     model="test";
     color="red";
     seats=4;

  }
   public void display(){
    System.out.println("Model" + model);
    System.out.println("Color" + color);
    System.out.println("Seats" + seats);

   }

}

public class CarExample{
    public static void main (String [] args){

        Car car=new Car();


    }
}