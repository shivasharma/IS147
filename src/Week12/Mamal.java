package Week12;

/**
 * Created by Shiva on 11/18/2015.
 */
public class Mamal  implements Animal{

    public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel(){
        System.out.println("Mammal travels");
    }

    public int noOfLegs(){
        return 0;
    }
    public void sleep(){
        System.out.println("Mammal sleeps");
    }

    public static void main(String args[]){
        Mamal m = new Mamal();
        m.eat();
        m.travel();
        m.sleep ();
    }
}
interface Animal {
    public void eat();
    public void travel();
    public void sleep();
}




