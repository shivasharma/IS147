public class Formatter {
   
    public static void main(String[] args) {
        formatterEg();
        twodigit_decimal_format();
    }
 /*
 c formats a character or char.
s formats a string.
d formats integers.
f formats floating-point or decimals.
t formats date and time.
b formats boolean values or conditional expressions.
e formats exponential floating-point numbers.
%n is used as a newline character and takes the cursor to the next line.
     */
    public static void formatterEg(){
        System.out.printf("Printing an integer %d %n", 10);
        System.out.printf("Printing a floating-point number %f %n", 10.0);
        System.out.printf("Printing an exponential floating-point number %e %n", 10.0);
        System.out.printf("Printing a string %s %n", "String");
        System.out.printf("Printing a character %c %n", 'A');
        System.out.println("---------------------------------------");
    }
    public static void twodigit_decimal_format(){
        double input = 3.14159265359;
        System.out.println("double : " + input);
        System.out.println("double : " + String.format("%.2f", input));
        System.out.format("double : %.2f", input);
    }
}
