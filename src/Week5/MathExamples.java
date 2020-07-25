package Week5;

import java.util.Random;


public class MathExamples {


    public static void main(String[] args) {


        //Exponent Methods
        System.out.println ("Exponent:" + Math.round (1));
        System.out.println ("Log: " + Math.log (2.71));
        System.out.println ("Power: " + Math.pow (2, 3));
        System.out.println ("Power: " + Math.pow (3.5, 2.5));
        System.out.println ("Square root: " + Math.sqrt (4));

        //Trignometric Methods

        System.out.println ("Sin 0 " + Math.sin (0));
        System.out.println ("Sin Math PI/2 " + Math.sin (Math.PI / 2));
        System.out.println ("toRadians " + Math.toRadians (90));


        //Rounding Method
        System.out.println( "ceil "+ Math.ceil (5.0));
        System.out.println( "ceil "+ Math.ceil (5.4));
        System.out.println ("---------------------------------");
        System.out.println( "floor "+ Math.floor (5.0));
        System.out.println( "floor "+ Math.floor (5.9));
        System.out.println ("---------------------------------");
        System.out.println( "rint "+ Math.rint (5.0));
        System.out.println( "rint "+ Math.rint (5.5));
        System.out.println ("---------------------------------");
        System.out.println( "round "+ Math.round (5.0));
        System.out.println( "round "+ Math.round (5.5));

        //Random Methoda
        System.out.println ((int)(Math.random()* 1001));

        Random rand= new Random ();
        int num= rand.nextInt(9999999)+9999999;
        System.out.println(num);
    }
}
