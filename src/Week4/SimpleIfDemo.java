package Week4;

import java.util.Scanner;
public class SimpleIfDemo {
    public static void main(String[] args) {
        
        
        //part1
        int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}

#Short Hand If...Else (Ternary Operator)

int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
        
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter an integer: ");
        int number = input.nextInt ();

        if (number % 5 == 0)
            System.out.println ("HiFive");

        else if  (number % 2 == 0)
            System.out.println ("HiEven");
        else
            System.out.println ("Invalid number");
    }

    int percentage=70;

       if(percentage>=60){
        System.out.println("A grade");
    }else if(percentage>=40){
        System.out.println("B grade");
    }else {
        System.out.println("Not Eligible");
    }
    

    int percentage=70;

    String resultValue = (percentage>=60)?"A grade":((percentage?=40)?"B grade":"Not    Eligible");
        System.out.println(resultValue);
}
