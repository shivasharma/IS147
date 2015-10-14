package Week7;

/**
 * Created by s.sharma on 10/5/2015.
 */
public class Scope {


    static int number=100; //global class variable

    public static void main(String[] args)
    {

        int num=20; //local method variable
        System.out.println("Global Number is " +number);
        System.out.println("Main Number is" +num);
        sub();
    }

    public static void sub(){
        int num=500;
        System.out.println("Global Number is" +number);
        System.out.println("Sub Number is " +num);
    }
}
