package Week4;

import java.util.Scanner;

/**
 * Created by Shiva on 9/12/2015.
 */
public class Switch {


    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter your classname for eg. IS147");
        String className = sc.nextLine ();
        execute (className);
    }

    public static void execute(String command) {
        switch (command) {
            case "IS310":

                System.out.println ("Software and Hardware Concepts");
                break;
            case "IS410":

                System.out.println ("Introduction to Database Design");
                break;
            case "IS403":
            case "IS 403":
                System.out.println ("User Interface Design ");
                break;

            case "IS 147":

                System.out.println ("Introduction to Computer Programming");
                break;

            default:
                System.out.println ("Invalid class");
        }


    }
}