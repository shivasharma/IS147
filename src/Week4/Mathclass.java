
package Week3;


public class Mathclass {
    public static void main(String[] args) {
         final double power = Math.pow(2, 3);
        double pie = Math.PI;
        int dice= (int) ( Math.random()*6);
        double value1 = Math.abs(-20);
        System.out.println(power);
        System.out.println(value1);
        System.out.println(pie);
        System.out.println(dice);
        System.out.println(Math.sqrt(25)); //5.0
        System.out.println(Math.pow(5, 3)); //125.0

        double a = 3.24;
        System.out.println(Math.ceil(a));
        // Math.ceil() method
        // value greater than 5 after decimal
        double a1 = 1.878;
        System.out.println(Math.ceil(a1));  // 2.0


        // value equals to 5 after decimal
        double b = 1.5;
        System.out.println(Math.ceil(b));  // 2.0


        // value less than 5 after decimal
        double c = 1.34;
        System.out.println(Math.ceil(c));  // 2.0

        // generates a random number between 0 to 1
        System.out.println(Math.random());
    }
}
