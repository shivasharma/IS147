package Week7;

/**
 * Created by s.sharma on 10/5/2015.
 */
public class ReturnValueFromMethod {

    public static void main(String[] args)
    {

       int number=25;
        System.out.println( number + " is " + sub(number));

        if(sub2(number)){
            System.out.println( number + " is above 10");
        }
    }

    private static String sub(int num) {
      return (num%2==0)?"even":"odd";
    }

    private static boolean sub2(int num){
        return (num>10)?true:false;
    }
}
