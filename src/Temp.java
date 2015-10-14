//  Buban Ndeta bndeta@gmail.com
package com.company;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number = 10;
        char repeat;
        String input;
        int count = 0;

        int score1;
        int score2;
        int score3;
        double ScoreAvg;

        System.out.print("Enter the first score: ");
        score1 = keyboard.nextInt();

        System.out.print("Enter the second score: ");
        score2 = keyboard.nextInt();

        System.out.print("Enter the third score: ");
        score3 = keyboard.nextInt();

        ScoreAvg = (score1 + score2 + score3) / 3.0;
        ScoreAvg = Math.round(ScoreAvg);


        System.out.println("Average score: " + ScoreAvg + " " + "\n");

        System.out.println("Would you like to average another set of test scores press Y for yes or N for no");
        keyboard.nextLine();
        input = keyboard.nextLine();
        repeat = input.charAt(0);

        while (repeat == 'Y' || repeat == 'y' || (!(repeat == 'Q')) ) {
            count++;
            System.out.print("Enter the first score: ");
            score1 = keyboard.nextInt();

            System.out.print("Enter the second score: ");
            score2 = keyboard.nextInt();

            System.out.print("Enter the third score: ");
            score3 = keyboard.nextInt();

            ScoreAvg = (score1 + score2 + score3) / 3.0;
            ScoreAvg = Math.round(ScoreAvg);

            System.out.println(ScoreAvg);

            System.out.println("Average score: " + ScoreAvg + " " + "\n");

            System.out.println("Would you like to average another set of test scores press Y for yes or N for no");
            keyboard.nextLine();
            input = keyboard.nextLine();
            repeat = input.charAt(0);
        }
    }
}





