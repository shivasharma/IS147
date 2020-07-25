package Week11.Inheritance;


public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("A new dog has been created!");
    }


    public void sleep() {
        System.out.println("A dog sleeps...");
    }


    public void eat() {
        System.out.println("A dog eats...");
    }
}