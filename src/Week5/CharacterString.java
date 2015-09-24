package Week5;

import java.util.Locale;

/**
 * Created by Shiva on 9/23/2015.
 */
public class CharacterString {

    public static void main(String[] args) {

      // ASCII and UNICODE
        char ch='a';
        System.out.println (++ch);
        System.out.println ("------------------------------");
        char letter = 'A'; //(ASCII)
        System.out.println ("A ASCII character is " +letter);
        System.out.println ("------------------------------");
        char numChar = '4';// (ASCII)
        System.out.println ("4 ASCII character is "+ numChar);
        System.out.println ("------------------------------");
        char letterUni = '\u0041'; //(Unicode)
        System.out.println ("UNICODE  Letter character is "+ letterUni);
        System.out.println ("------------------------------");
        char numCharUni = '\u0034'; //(Unicode)
        System.out.println ("Unicode Number character " +numCharUni);
        System.out.println ("------------------------------");

        //ESCAPE SEQUENCE
        System.out.println ("Hello \n world");
        System.out.println ("------------------------------");
        System.out.println ("Hello \b world");
        System.out.println ("------------------------------");
        System.out.println ("Hello \f world");
        System.out.println ("------------------------------");
        System.out.println ("Hello \r world");
        System.out.println ("------------------------------");
        System.out.println ("Hello \\ world");
        System.out.println ("------------------------------");
        System.out.println ("Hello \" world");


        // The string Type
        System.out.println ("-------------The String Type---------------");

        String message= "Welcome to Java";
        System.out.println (message);

        String stringMessage = new String("Welcome to Java");
        System.out.println (stringMessage);


         //Integer I= new Integer (20);
         //System.out.println (I);

        System.out.println ("------------------------------");

        System.out.println ("------------- String Are Immutable---------------");

        String s="Java";
        s="HTML";
        System.out.println (s);


        System.out.println ("------------- String Length---------------");

        String myMessage= "    Welcome to JAVA   ";
        System.out.println ("The length of "+ myMessage + " is " + myMessage.length ());
        System.out.println ("The first character in myMessage is  "+ myMessage.charAt (0));

        System.out.println ("------------- String CASE---------------");
        String myMessageString= " java programming";
        System.out.println ("Uppercase "+ myMessageString.toUpperCase ());
        System.out.println ("Lowercase "+ myMessageString.toLowerCase ());
        System.out.println ("Trim  "+ myMessageString.trim ());

        System.out.println ("------------- Concatenation---------------");

        String s1= " java programming ";
        String s2= " Is easy";

        String s3= s1.concat (s2);
        System.out.println ("Concat "+ s3);

        System.out.println ("------------- String Index of ---------------");

        String str="myemail@umbc.edu";
        int isAt=str.indexOf ("@");
        System.out.println (isAt);
        System.out.println ("------------------------------");

        int isDot=str.indexOf ('.');
        System.out.println (isDot);
        System.out.println ("------------------------------");


        System.out.println ("------------- String Specifier ---------------");

        int count=5;
        double amount=45.56;
        String product=" Nike Shoes";

        System.out.printf ("you bought %d product name %s  each at %f per unit", count, product,amount );

        System.out.println ();
        System.out.println ("------------- String Substring ---------------");

        String strSubstring="Java Programming";
        String sub1=strSubstring.substring (0,5);
        String sub2=strSubstring.substring (5);
        System.out.println (sub1);
        System.out.println (sub2);

        System.out.println ("------------- String Equal ---------------");

        String str1="Java programming";
        String str2="is fun";
        String str3= "is fun";

        String result=str1.equals(str2)?"equal": "no equal";
        System.out.println (result);


        boolean result2= str2.equals (str3);
        System.out.println (result2);




    }
}
