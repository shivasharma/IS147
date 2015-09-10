package Week3;

/**
 * Created by Shiva on 9/9/2015.
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class Purchase {


    public static void main(String[] args) {

        final double TAX_RATE = 0.06;  // 6% sales tax
        int quantity;
        double subtotal, tax, totalCost, unitPrice;

        Scanner scan = new Scanner (System.in);

        NumberFormat fmt1 = NumberFormat.getCurrencyInstance ();
        NumberFormat fmt2 = NumberFormat.getPercentInstance ();

        System.out.print ("Enter the quantity: ");
        quantity = scan.nextInt ();

        System.out.print ("Enter the unit price");
        unitPrice = scan.nextDouble ();

        subtotal = quantity * unitPrice;tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;

        System.out.println ("Subtotal: " + fmt1.format (subtotal));
        System.out.println ("Tax: " + fmt1.format (tax) + " at " + fmt2.format (TAX_RATE));
        System.out.println ("Total: " + fmt1.format (totalCost));
    }
}


