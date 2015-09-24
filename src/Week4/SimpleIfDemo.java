package Week4;

import java.util.Scanner;

/**
 * Created by Shiva on 9/12/2015.
 */
public class SimpleIfDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print ("Enter an integer: ");
        int number = input.nextInt ();

        if (number % 5 == 0)
            System.out.println ("HiFive");

        else if  (number % 2 == 0)
            System.out.println ("HiEven");
        else
            System.out.println ("Invalid number");
    }

}
