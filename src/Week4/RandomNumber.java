package Week4;

import java.util.Random;

/**
 * Created by Shiva on 9/12/2015.
 */
public class RandomNumber {
    public static void main (String [] args){



        //Using Math class
        //If you want to generate a number from 0 to 100 then your code would look like this:
        int number1 = (int)(Math.random() * 101);
        System.out.println (number1);


        //If you want to generate a number from 0 to 1000 then your code would look like this:
        int number2= (int)(Math.random() * 1001);
        System.out.println (number2);

        //To generate a number from 10 to 20 :
        int range=(int)(Math.random() * 11 + 10);
        System.out.println (range);

        //Using Random class
       //If you want to generate a number from 0 to 10 then your code would look like this:
        Random randominInt= new Random ();
        int numberInt = randominInt.nextInt (11);
        System.out.println ("The Int Random is " + numberInt);

        Random random= new Random ();
        double number3 = random.nextDouble()*1000;
        System.out.println ("The Double Random \t is " +number3);
    }

}
