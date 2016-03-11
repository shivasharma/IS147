package Week6;

import java.util.Scanner;

/**
 * Created by s.sharma on 3/10/2016.
 */
public class Quit {

    public static void main(String[] args) {

        Scanner grade = new Scanner(System.in);

        Scanner stay = new Scanner(System.in);
        String cont = "";

        while (!cont.equalsIgnoreCase("q")) {


            System.out.println("Welcome to How Bad Am I Failing. Please enter you three grades for your class. ");

            System.out.print("\nWould you like to average out another class your failing. Type q to quit, or press any other key. ");
            cont = stay.nextLine();
        }
        System.out.print("Bye. Good luck in your classes. :)");
    }
    }

