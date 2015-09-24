package Week4;

/**
 * Created by Shiva on 9/19/2015.
 */
import java.util.Random;
import java.util.Scanner; // Scanne
public class Demo {





                public static void main(String[] args)
                {
                    Scanner scan = new Scanner(System.in);
                    Random rand= new Random();
                    System.out.println ("We will be creating your Social Security Number; Please Enter your First Name.");
                    String first= scan.nextLine().toUpperCase();
                    System.out.println("Please Enter your Last Name.");
                    String last = scan.nextLine().toUpperCase();
                    int beginning=rand.nextInt(900)+100;
                    int middle = first.charAt(first.length()-1);
                    String endS= last.substring(0,2);
                    int endNum1= endS.charAt(1);
                    int endNum2= endS.charAt(1);
                    String SSN= beginning+"-" + middle + "-"+ endNum1+endNum2;
                    System.out.println("Your new Social Security Number is: "+SSN);

                }
            }







