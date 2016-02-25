package Week11.Inheritance;

/**
 * Created by Shiva on 11/11/2015.
 */
public class Bird extends Animal {
    public Bird() {
        super();
        System.out.println("A new bird has been created!");
    }


    public void sleep() {
        System.out.println("A bird sleeps...");
    }


    public void eat() {
        System.out.println("A bird eats...");
    }


}