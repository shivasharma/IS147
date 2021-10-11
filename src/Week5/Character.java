public static void main(String[] args) {

  
     System.out.println("Is digit " +Character.isDigit('1'));
      // create 4 char primitives
      char ch1, ch2, ch3, ch4;

      // assign values to ch1, ch2
      ch1 = '4';
      ch2 = 'q';

      // assign uppercase of ch1, ch2 to ch3, ch4
      ch3 = Character.toUpperCase(ch1);
      ch4 = Character.toUpperCase(ch2);

      String str1 = "Uppercase of " + ch1 + " is " + ch3;
      String str2 = "Uppercase of " + ch2 + " is " + ch4;

      // print ch3, ch4 values
      System.out.println( str1 );
      System.out.println( str2 );
   }
