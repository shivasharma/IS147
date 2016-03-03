
import java.util.Scanner;
public class Loop {
    //

        public static void main(String[] args) {

            System.out.println ("---------- While Loop---------");
            WhileLoop();

            System.out.println ("----------Do While Loop---------");
            DowhileLoop();

            System.out.println ("----------For Loop---------");
            ForLoop();



        }


    public static void WhileLoop(){
        int i = 10;

        while( i < 20 ) {
            System.out.print("value of i : " + i );
            i++;
            System.out.print("\n");
        }
    }

    public static void DowhileLoop(){
        //Do while loop

        int u = 10;

        do{
            System.out.print("value of do while : " + u );
            u++;
            System.out.print("\n");
        }while( u < 20 );

    }

    public static void ForLoop(){
        for(int n = 10; n < 20; n = n+1) {
            System.out.print("value of n : " + n );
            System.out.print("\n");
        }
    }

}



