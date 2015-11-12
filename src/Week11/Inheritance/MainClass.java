package Week11.Inheritance;

/**
 * Created by Shiva on 11/11/2015.
 */
public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println();

        animal.sleep();
        animal.eat();

        bird.sleep();
        bird.eat();

        dog.sleep();
        dog.eat();



    }
}
