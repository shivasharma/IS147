
import java.util.Scanner;

/**
 * Created by Shiva on 10/3/2015.
 */
public class Temp {

        public static void main (String []args){
            int numberofgrades = 0;
            double totalSum = 0.0;
            double average = 0.0;
            String cont;

            Scanner answer = new Scanner(System.in);


            System.out.print ("Would you like to enter 3 test grades?\nPress Y to continue or Q to Quit.");
            cont = answer.next();



            while (cont != "Q") {



                System.out.print ("Enter the test grade: ");
                int grade1=answer.nextInt ();

                System.out.print ("Enter the test grade: ");
                int grade2=answer.nextInt ();

                System.out.print ("Enter the test grade: ");
                int grade3=answer.nextInt ();

                totalSum=grade1+grade2+grade3;
                average = totalSum/3;


            }


            System.out.println("The average of the test grades is: " + average);
        }
    }




