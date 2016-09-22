package Week4;

/**
 * Created by Shiva on 9/21/2016.
 */
public class BooleanExample {

    static boolean defaultValue;

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println ("The value of b1 is:" + b1);
        System.out.println ("The value of b2 is:" + b2);
        System.out.println ("The value of boolean default is :" + defaultValue);

        String stringBoolean = "true";
        boolean parsed = Boolean.parseBoolean (stringBoolean);
        System.out.println ("Parsed value" + parsed);

        char c1 = '1';
        System.out.println ("Character " + c1);
        char dollarSign = '\u0024';
        System.out.println ("Currency " + dollarSign);

        //Example Postfix vs prefix
        int intValue = 10;
        System.out.println (intValue++);
        System.out.println (++intValue);


    }
}
