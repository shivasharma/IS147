package Week2.Print;

import java.util.Scanner;

/**
 * Created by Shiva on 8/30/2015.
 */
public class Java {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number;");
        num1=scan.nextInt();
        System.out.println("Enter second number;");
        num2=scan.nextInt();
        System.out.println("enter 0 to quit, enter 1 to add, enter 2 to subtract, enter 3 to multiply, enter 4 to divide");
        int add1, subtract1,multiply1, divide1;
        add1 = num1+num2;
        subtract1= num1-num2;
        multiply1= num1*num2;
        divide1= num1/num2;



    }
}


