package Week3;

/**
 * Created by s.sharma on 9/10/2015.
 */
public class Parse {

    public static void main(String args[]){
        int x =Integer.parseInt("10");
        double c = Double.parseDouble("50");
        System.out.println(x);
        System.out.println(c);


        int intValue = 20;
        System.out.println ("The value of intValue is:" + intValue);
        long longValue = intValue;
        System.out.println ("The value of longValue is:" + longValue);

        short shortValue = (short) intValue;
        System.out.println ("The value of loshortValues is:" + shortValue);


        int intValue3 = 1024;
        //lost data
        byte byteValue = (byte) intValue3;
        System.out.println ("The value of byte is:" + byteValue);

        double doubleValue = 3.99999d;
        int integerValue = (int) doubleValue;
        System.out.println ("The value of integerValue is:" + integerValue);
    }
}
