package Week6;
import java.util.Scanner;

/**
 * Created by Shiva on 9/27/2015.
 */
public class Menu {
    public static void main(String[] args) {


        MenuUsingDoWhile();
        //MenuUsingFor();


    }

  public static void MenuUsingDoWhile(){
      int number=10;
      char repeat;
      String input;
      int sum=0;
      Scanner keyboard= new Scanner (System.in);
      System.out.println (" This program sum the number");
      do{
          System.out.print("Enter a number: ");
          number=keyboard.nextInt();
          System.out.println (number);
          sum+=number;
          System.out.println ("Would you like to add another number press Y for yes or N for no" );
          keyboard.nextLine ();
          input=keyboard.nextLine();
          repeat=input.charAt(0);
      }while(repeat =='Y'||repeat=='y' );
      System.out.format (" The sum of current number %d " ,sum);

  }
    public static void MenuUsingFor(){
        for(;;) {      // loop for ever

            System.out.println("\t*MENU");

            System.out.println("0. Exit");

            System.out.println("1. Add New Entry");

            System.out.println("2. Edit Entry");

            System.out.println("3. Display list of Clients");

            System.out.println("4. Delete entry");
;

            Scanner input = new Scanner(System.in) ;
            System.out.println ("Enter your choise");
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



                default: System.out.println("Invalid Option"); break;

            }

        }    // <--- en for(;;)/>

    }

}

