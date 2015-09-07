package Week3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Shiva on 9/7/2015.
 */
public class Payroll {

    public static void main(String[] args) {

        String name;
        int age;
        double hours;
        double payRate;
        double grosspay;
        boolean overtime;
        char signPayroll;


        //scanner class reads input from the console;
        Scanner sc= new Scanner(System.in);

        System.out.print("What is your name?");
        name=sc.next();

        System.out.print("What is your age?");
        age=sc.nextInt();


        System.out.print("How many hours did you work this week?");
        hours=sc.nextDouble();

        System.out.print ("What is your hourly pay rate?");
        payRate=sc.nextDouble();

      //calculate grosspay

        grosspay=hours * payRate;
        System.out.println(" ********************************************************");
        System.out.println (" Hello " + name + " You are " + age + " years old ");
        System.out.printf (" Your gross pay is $%.3f", grosspay);
        System.out.println ();
        System.out.println (" ********************************************************");

        DecimalFormat df= new DecimalFormat("#.###");


    }

}
