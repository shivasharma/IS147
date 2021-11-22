package Week11.Inheritance;


public class Animal {

    int age;
    int name;
    public Animal() {
        System.out.println("A new animal has been created!");
    }

    public Animal(int age,String name){
        this.age=age;
        ths.name=name;
    }
    public void sleep() {
        System.out.println("An animal sleeps...");
    }

    public void eat() {
        System.out.println("An animal eats...");
    }

    private void iamPrivateMethod(){

    }
}