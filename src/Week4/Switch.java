package Week4;

import java.util.Scanner;

/**
 * Created by Shiva on 9/12/2015.
 */
public class Switch {


    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter your classname for eg. IS147: ");
        String className = sc.nextLine ();
        Showmyclass (className);
    }

    public static  void Showmyclass(String myclass) {
        switch (myclass) {
            case "IS310":

                System.out.println ("Software and Hardware Concepts");
                break;
            case "IS410":

                System.out.println ("Introduction to Database Design");
                break;
            case "IS403":

                System.out.println ("User Interface Design ");
                break;

            case "IS147":
            case "IS 147":
                System.out.println ("Introduction to Computer Programming");
                break;

            default:
                System.out.println ("Invalid class");
        }


    }
}