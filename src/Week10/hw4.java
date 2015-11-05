package Week10;

/**
 * Created by Shiva on 11/4/2015.
 */
public class hw4 {
    public hw4(){
        System.out.println("Default constructor");
    }
    public hw4(String str){
        //It will call a default constrctor
        System.out.println("Parametrized constructor with single param");
    }
    public hw4(String str, int num){
        //It will call the constructor with String argument

        System.out.println("Parametrized constructor with double args");
    }
    public hw4(int num1, int num2, int num3){
        // It will call the constructor with (String, integer) arguments

        System.out.println("Parametrized constructor with three args");
    }
    public static void main(String args[]){
        //Creating an object using Constructor with 3 int arguments

    }
}
