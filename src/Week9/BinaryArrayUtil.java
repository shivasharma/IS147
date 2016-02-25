package Week9;

import java.util.Arrays;

/**
 * Created by Shiva on 10/21/2015.
 */
public class BinaryArrayUtil {

    public static void main(String args[])
    {
        char characters[] = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println ("-------------------Printing Characters at index-------------------");
        System.out.println(Arrays.binarySearch (characters, 'a'));
        System.out.println(Arrays.binarySearch(characters, 'g'));

        int numbers[] = { 1, 2, 5, 7, 10 };
        System.out.println ("-------------------Printing Integers-------------------");

        System.out.println(Arrays.binarySearch (numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 7));
    }
}
