package Week6;
import java.util.Scanner;

/**
 * Created by Shiva on 9/27/2015.
 */
public class Menu {
    public static void main(String[] args) {


       // Conversion();
        MenuUsingFor();


    }

    public static void Conversion(){


        Scanner input = new Scanner(System.in) ;
        String units;       // Unit of measurement, entered by user.
        double measurement; // A numerical measurement, input by the user.
        String quit="q";
        double inches;      // The same measurement, converted into inches.
        do {
            System.out.println ("What unit of measurement does your input use?");
            System.out.print ("Legal responses: inches, feet, yards, or miles : ");
            units = input.next ().toLowerCase ();

            System.out.print ("Enter the number of " + units + ":  ");
            System.out.println ("Enter q to quit program");
            measurement = input.nextDouble ();
            quit=input.next ();

            switch (units) {
                case "inches":
                    inches = measurement;
                    System.out.println ("Inches" + inches);

                    break;
                case "feet":
                    inches = measurement * 12;

                    break;
                case "yards":
                    inches = measurement * 36;
                    break;
                case "miles":
                    inches = measurement * 12 * 5280;
                    break;
                default:
                    System.out.println ("Wait a minute!  Illegal unit of measure!  I quit!");
                    System.exit (1);
            } // end switch
        }while(quit=="q");
    }

    public static void MenuUsingFor(){
        for(;;) {      // loop for ever

            System.out.println("\t*MENU");

            System.out.println("0. Exit");

            System.out.println("1. Add New Entry");

            System.out.println("2. Edit Entry");

            System.out.println("3. Display list of Clients");

            System.out.println("4. Delete entry");

            System.out.println("5. Deposit");

            System.out.println("6. Withdrawal");

            Scanner input = new Scanner(System.in) ;
            System.out.println ("Enter yuor choise");
            int opt =input.nextInt ();

            int option = opt;

            switch(option) {

                case 0 : System.out.println("Exiting"); return;    // <---    exiting

                case 1 : System.out.println("Adding New Entry");
                           int a =5+10;
                           System.out.println (a);
                           break;

                case 2 : System.out.println("Editing Entry"); break;

                case 3 : System.out.println("Displaying list of Clients"); break;

                case 4 : System.out.println("Deleting Entry"); break ;

                case 5 : System.out.println("Depositing"); break;

                case 6 : System.out.println("Withrawing"); break;

                default: System.out.println("Invalid Option"); break;

            }

        }    // <--- en for(;;)/>

    }

}

