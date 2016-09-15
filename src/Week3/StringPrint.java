package Week3;

import java.util.Date;

/**
 * Created by Shiva on 2/10/2016.
 */
public class StringPrint {
    public static  void main(String[] args){

        System.out.println("Welcome to Java \"Programming!\" IS147.");
        //Insert a tab in the text at this point.
        System.out.println("Welcome to Java \t IS147.");
       //Insert a backspace in the text at this point.
        System.out.println("Welcome to Java \b IS147.");
       // Insert a newline in the text at this point.
        System.out.println("Welcome to Java \n IS147.");
        //Insert a carriage return in the text at this point.
        System.out.println("Welcome to Java \r IS147.");

        System.out.printf("%10s %10s %10s\n", "Hello", "Java", "I am a string");

        //print date
        System.out.printf("The DATE is %tD\n", new Date () );
        // num is 3.141593
        System.out.printf("num is %f\n", Math.PI );
        // num is 3.14
        System.out.printf("num is %.2f\n", Math.PI );

        System.out.print (Math.PI);
        System.out.println ("******************STRING PRINT FORMAT*******************************");

        float floatVar=1.345f;
        int intVar =5;
        String stringVar="Welcom to Java";

        //format string using printf
        System.out.printf("The value of the float " + "variable is %f, while " + "the value of the " + "integer variable is %d, " + "and the string is %s", floatVar, intVar, stringVar);

        String fs;
        System.out.println ();
        //format string using String.format method
        fs = String.format("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        " and the string is %s",
                floatVar, intVar, stringVar);
        System.out.println(fs);

    }
}
