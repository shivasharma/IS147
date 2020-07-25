package Week12;


interface Animal {
    void eat();

    void travel();

    void sleep();
}

public class Mamal implements Animal {

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs(){
        return 0;
    }
    public void sleep(){
        System.out.println("Mammal sleeps");
    }

    public static void main(String[] args) {
        Mamal m = new Mamal();
        m.eat();
        m.travel();
        m.sleep();
    }
}




