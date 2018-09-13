package Week3;

import java.math.BigDecimal;

/**
 * Created by Shiva on 9/14/2018.
 */
public class BigDecimalExample {
    public static void main(String[] args) {
        //what is the result of sum
        double myValue = .012;
        double sum = myValue + myValue + myValue;
        System.out.println (sum);


        String strValue = Double.toString (myValue);
        System.out.println ("StrValue " + strValue);
        BigDecimal bigValue = new BigDecimal (strValue);

        BigDecimal bigSum = bigValue.add (bigValue).add (bigValue);
        System.out.println ("Sum of BigDecimals: " + bigSum.toString ());


        //Copying values with primitives

        int myFirstValue = 50;
        int mySecondValue = myFirstValue;
        System.out.println ("The first value is " + myFirstValue);
        System.out.printf ("The second vlaue is", mySecondValue);
    }
}
