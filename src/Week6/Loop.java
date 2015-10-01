package Week6;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by Shiva on 9/27/2015.
 */
public class Loop {

    public static void main(String[] args) {

       /* out.println ("---------- While Loop---------");
        WhileLoop();

        out.println ("----------Do While Loop---------");
        DowhileLoop();

        out.println ("----------For Loop---------");
        ForLoop ();

        out.println ("----------For each Loop---------");
        Foreach();

        out.println ("---------- Loop with break---------");
        LoopWithBreak ();


        out.println ("---Multiplication Table-----");
        int number=7;
        MultiplicationTable(number);


        int tableSize = 20;
        printMultiplicationTable(tableSize);
        PrintSumofOddNumber();

        Average();*/

       // ControlFlowMenu();
    }


    public static void printMultiplicationTable(int tableSize) {
        int row, numberOfStars;

        for (row = 10; row >= 1; row--) {
            for(numberOfStars = row; numberOfStars >= 1; numberOfStars--) {
                out.print ("\t" + row);
            }
            out.println(); // Go to next line
        }


    }

    private static void MultiplicationTable(int n) {

            out.println("Multiplication table for "+n);
            out.println("---------------------------");
            for(int i = 1; i<=10;i++) {
                out.format("%2d x %d = %3d\n", i,n,i*n);
            }

    }

    public static void PrintSumofOddNumber(){
        int i;
        int sum=0;
        int count=0;
        for(i=0;i<=100;i++)
        {
            if(i%2!=0)
                out.println (i);
                sum+=i;
                count++;

        }
        out.printf ("Running sum %d is %d ", i, sum);
        out.println ("Count is " + count);
        out.println ("Average is oddnumber is" + sum/count);
        out.println("sum of all odd numbers between 1 to 100 is:"+sum);
    }

    public static void WhileLoop(){
        int i = 10;

        while( i < 20 ) {
            out.print("value of i : " + i );
            i++;
            out.print("\n");
        }
    }

    public static void DowhileLoop(){
        //Do while loop

        int u = 10;

        do{
            out.print("value of do while : " + u );
            u++;
            out.print("\n");
        }while( u < 20 );

    }

    public static void ForLoop(){
        for(int n = 10; n < 20; n = n+1) {
            out.print("value of n : " + n );
            out.print("\n");
        }
    }

    private static void Foreach() {

        int[] numericals = {100, 200, 300, 400, 500};

        for (int u : numericals) {
            out.print (u);
            out.print (",");
        }
        out.print ("\n");
        String[] names = {"Danny", "William", "Lucy", "Sam"};

        for (String name : names) {
            out.format ("\n%s" ,name.toString ());
            out.print (",");
        }
    }

    private static void LoopWithBreak(){

        int x,y;
        for(x=1; x<5 ; x++){

            for(y=1;y<5; y++){
                if(y>x)
                    break;
                out.println (y);
            }

            if(x%2!=0)
                continue;
                out.println ("\n");

        }

    }


   private static void Average(){
       Scanner In= new Scanner(in);
       out.println("Submit marks (value < 0 to stop");
       int totalMarks = 0; // the sum of all marks entered
       int numberOfMarks = 0; // the number of marks entered so far
       int nextMark = In.nextInt ();

       while (nextMark >= 0)
       {
           totalMarks += nextMark;
           numberOfMarks++;
           out.println("Next mark:");
           nextMark = In.nextInt();
       }

       if (numberOfMarks > 0)
       {
           int average = Math.round((float)totalMarks/numberOfMarks);
           out.println("Average for " + numberOfMarks +
                   " students is " + average);
           out.println ("Grades Are" + nextMark);
       }

   }




    private static void ControlFlowMenu(){
        boolean b=true;
        int option;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("\t Welcome to IS147  Interactive Menu System:");
            System.out.println("\t1. See the menu");
            System.out.println("\t2. Read he menu");
            System.out.println("\t3. Repeat the menu");
            System.out.println("\t4. Again");
            System.out.println("\t5. I didn't read, could you repeat?");
            System.out.println("\t0. Out");

            System.out.print("\nType your choice: ");
            option = input.nextInt ();

            if(option == 0){
                b = false;
                System.out.println("Program finished");
            }
            if(option == 1){
                b = true;
                System.out.println ("You called "+option);
            }

            if(option == 2){
                b = true;
                System.out.println ("You called "+option);
            }
            if(option == 3){
                b = true;
                System.out.println ("You called "+option);
            }
            if(option == 4){
                b = true;
                System.out.println ("You called "+option);
            }
            if(option == 5){
                b = true;
                System.out.println ("You called "+option);
            }

        } while(b);
    }
    }



