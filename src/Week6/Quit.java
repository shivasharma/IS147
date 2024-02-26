package Week6;

import java.util.Scanner;


public class Quit {

    public static void main(String[] args) {

        Scanner grade = new Scanner(System.in);

        Scanner stay = new Scanner(System.in);
        String myValue = "";

        while (!myValue.equalsIgnoreCase("q")) {

        System.out.println("A - List All Cars");
        System.out.println("B - Sort vehicles by vehicle Model");
        System.out.println("C - Sort vehicles by vehicle Cost\n");
        System.out.print("\nSelect a Menu Option: ");
            myValue = stay.nextLine();
        }
        System.out.print("Bye. Good luck finding you car. :)");
    }
    }

