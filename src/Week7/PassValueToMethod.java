package Week7;

/**
 * Created by s.sharma on 10/5/2015.
 */
public class PassValueToMethod {


    public static void main(String[] args)
    {

        System.out.println("Pass the value");
        sub("value");
    }

    public static void sub(String hat){
        System.out.println("I got the" +hat);
    }
}
