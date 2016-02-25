package Week11.ConstructorInheritance;

/**
 * Created by Shiva on 11/11/2015.
 */
class Superclass {
    int age;

    Superclass(int age){
        this.age=age;
    }

    public void getAge(){
        System.out.println("The value of the variable named age in super class is: " +age);
    }
}
