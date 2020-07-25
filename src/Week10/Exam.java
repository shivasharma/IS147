package Week10;

import java.util.Scanner;


public class Exam {

    // Suppose x is 1. What is x after x += 2?
    public static void main(String[] argv) {
        System.out.println("Suppose x is 1. What is x after x += 2?");
        int x = 1;
        System.out.println(x += 2);


        // going form left to right PEMDAS, BODMAS
        System.out.println(" 4 + 20 / (3 - 1) * 2");
        System.out.println(4 + 20 / (3 - 1) * 2);

        //The result of 10000 * 10000 * 10000 is too large to be stored in an int variable n
      // This causes an overflow and the program continues to execute because Java does not report errors on overflow.
     int n=10000*10000*10000;
      System.out.println (n);

      //System.out.println (xMethod((double)5));


        double sum=0;

      for(double d=0; d<10; sum+=sum+d){
          d+=0.1;
         // System.out.println (d);
      }

      xMethod (new double[]{3,3});
      xMethod (new double[5]);
     // xMethod (new double[3]{1,2,3});

      System.out.println ("The program display 1234");
      int[]x1={1,2,3,4};
      int[]y=x1;
      x1=new int[2];
      for (int i = 0; i < y.length; i++) {

          System.out.print (y[i] + "");
          
      }
      System.out.println ("Assume boolean[][] x = new boolean[5][7], what are x.length and x[2].length?");
      boolean[][]abc=new boolean[5][7];
      System.out.println (abc.length +  " and " +abc[2].length );




      System.out.println ();
      String s1= "Welcome to java ";
      String s2= "Programming  is fun";

      CharSequence cs1 = "Welcome";

      System.out.println (s1.equals (s2));
      System.out.println (s2.equals (s1));
      System.out.println (s1.contains (s2));
      System.out.println (s2.contains (s1));
      System.out.println (!s1.contains (s2));

     // System.out.println ( s1.contains(cs1));

      System.out.println ("argv.lenght is " + argv.length);

      System.out.println ("A"+1);

      int count=0;
      while(count<10){
          System.out.println ("Welcome to java");
          count++;
      }
     //There is an issue with this question
      System.out.println ((int)Math.random ());
      System.out.println ((int)Math.random ()+1);
      System.out.println ((int)Math.random ()+ 0.5);
      System.out.println ((int)Math.random ()+0.20);
      System.out.println ((int)Math.random ()+0.80);
      System.out.println ((int)Math.random ());


      double x2=5.5;
      int z=(int)x2;
      System.out.println ("x2 is " + x2 + " and z is " +z);

  //This question was repeated
      boolean even=false;
      if(even){
          System.out.println ("It is even");
      }

      Scanner input= new Scanner (System.in);
      int number=0;

      if(number<=0)
          System.out.println (number);

      int age=15;

    //  if(age<16)
      //    System.out.println ("cannot get a driver license");

    //  if(age>=16)
      //    System.out.println ("can get a driver license");


      if(age<16)
          System.out.println ("cannot get a driver license");
      else
          System.out.println ("can get a driver license");

    //  if(age<16){
      //    System.out.println ("cannot get a driver license");
    //  }
    //  else if(age>=16)
    //      System.out.println ("can get a driver license");
    //


  }

    public static int xMethod(int n){
        System.out.println ("int");
        return n;
    }

    public static long xMethod(long n){
        System.out.println ("long");
        return n;
    }

    public static void xMethod(double[]a){
        System.out.println (a.length);
    }



}
