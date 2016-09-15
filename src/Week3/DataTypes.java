package Week3;

/**
 * Created by s.sharma on 9/10/2015.
 */

public class DataTypes {
    public static void main(String[] args) {
        char letter = 'A';
        boolean done = false;
        int radius = 10;
        //byte can be from -127 to +127 it can be used to create saturation of colors
        byte red = 127;
        //it is small than int
        short age = 21;
        long population = 32145141;
        float price = 10.78f;
        double circleArea = Math.PI * radius * radius;

        // strings are arrays of characters string are not primitive data types, they are immutable
        String name = "Shiva Sharma";


        System.out.println (letter);
        System.out.println (done);
        System.out.println (radius);
        System.out.println (red);
        System.out.println (age);
        System.out.println (population);
        System.out.println (price);
        System.out.println (circleArea);
        System.out.println (name);


    }
}
