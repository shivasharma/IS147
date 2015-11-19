package Week12;

/**
 * Created by Shiva on 11/18/2015.
 */
public class InterfaceDemo  implements Animal{

    public void eat() {
        System.out.println("Mammal eats");
    }


    public void travel() {
        System.out.println("Mammal travels");
    }


    public int noOfLegs(){
        return 0;
    }
    public static void main(String args[]){
        InterfaceDemo m = new InterfaceDemo();
        m.eat();
        m.travel();
    }

}





interface Animal {
    public void eat();
    public void travel();
}