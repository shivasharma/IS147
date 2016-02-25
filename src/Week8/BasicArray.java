package Week8;

/**
 * Created by Shiva on 10/14/2015.
 */
public class BasicArray
{
    //-----------------------------------------------------------------
    //  Creates an array, fills it with various integer values,
    //  modifies one value, then prints them out.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        final int LIMIT = 15, MULTIPLE = 10;
        int[] list = new int[LIMIT];

        //  Initialize the array values
        for (int index = 0; index < LIMIT; index++)
            list[index] = index * MULTIPLE;

        list[5] = 999;  // change one array value

        //  Print the array values
        for (int value : list)
            System.out.print (value + "  ");
    }
}
