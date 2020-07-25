package Week8;

import java.util.Scanner;


public class Sales
{
    public static void main(String[] args)
    {
        final int SALES = 8;
        int[] sales = new int[SALES];
        int sum;
        Scanner scan = new Scanner (System.in);
        for (int i=1; i<sales.length; i++)
        {
            System.out.print("Enter sales for Day " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\n Sales for 7 days");
        System.out.println("--------------------");
        sum = 0;
        for (int i=1; i<sales.length; i++)
        {
            System.out.println("Day " + i + " Sales " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
    }
}