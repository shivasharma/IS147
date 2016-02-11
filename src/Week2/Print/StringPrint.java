package Week2.Print;

/**
 * Created by Shiva on 2/10/2016.
 */
public class StringPrint {
    public static  void main(String[] args){

        System.out.println("Welcome to Java \"Programming!\" IS147.");
//nsert a tab in the text at this point.
        System.out.println("Welcome to Java \t IS147.");
        System.out.println("Welcome to Java \b IS147.");
        System.out.println("Welcome to Java \n IS147.");
        System.out.println("Welcome to Java \r IS147.");


        System.out.println ("*************************************************");

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
