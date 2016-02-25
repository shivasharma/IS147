package com.company;
import java.util.Scanner;
public class Loop {
    //
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        String H = "Hello World";
        String h = "hello world";

        //length
        int l = h.length();
        System.out.println("The length of the string is " + l);
        //substring
        String sub = H.substring(0,5);
        System.out.println("A substring for the list is: " + sub);
        //indexOf
        int index = H.indexOf("d");
        System.out.println(index);
        //charAt
        char ch = H.charAt(6);
        System.out.println(ch);
        //uppercase
        String upperH = H.toUpperCase();
        String lowerH = H.toLowerCase();
        System.out.println(upperH);
        System.out.println(lowerH);
        //split
        String[] split = H.split(" ");
        String split1 = split[0];
        String split2 = split[1];
        System.out.println(split1 + " to the big " + split2);
        //contains
        boolean cont = H.contains("l");
        boolean cont1 = H.contains("z");
        System.out.println("The string H contains a l: " + cont + "\nSo does it contain a z: " + cont1);
        //equalIgnoreCase
        if (H.equalsIgnoreCase(h)) {
            System.out.println("This is the coolest thing I have ever done.");
        }
    }

}

