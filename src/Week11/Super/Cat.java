public class Cat extends  Animal{

    String catFood;

   // Super must be very fist line before setting other properties
   //  if the super is not used java will call the parent class no args constructor super();
    publci cat(int age,String name, String catFood){
       // this.age=age;
        //this.name=name;

        Super(age,name);
        this.catFood=catFood
    }


    public  void makeNoise(){
        super.makeNoise();
        System.out.println("I am a makeNoise method from Cat Class");
    }

     public void walk(){
        super.makeNoise();
        super.eat();
     }


}