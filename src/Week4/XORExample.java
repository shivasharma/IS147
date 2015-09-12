package Week4;

import java.util.Random;

/**
 * Created by Shiva on 9/12/2015.
 */
public class XORExample {


        public static void main(String[]args){
            boolean x = false;
            boolean y = false;
            boolean xXorY = x ^ y;
            System.out.println("false XOR false: "+xXorY); //false

            x = false;
            y = true;
            xXorY = x ^ y;
            System.out.println("false XOR true: "+xXorY); //true

            x = true;
            y = false;
            xXorY = x ^ y;
            System.out.println("true XOR false: "+xXorY); //true

            x = true;
            y = true;
            xXorY = x ^ y;
            System.out.println ("true XOR true: " + xXorY); //false



    }

}
