package Week9;

/**
 * Created by Shiva on 10/21/2015.
 */
public class RaggedArray {

    public static void main(String[] args)
    {
        //One Dimensional Array of lenghth 3
        int[] OneDimensionalArray1 = {1, 2, 3};

        //One Dimensional Array of lenghth 4
        int[] oneDimensionalArray2 = {4, 5, 6, 7};

        //One Dimensional Array of lenghth 5
        int[] oneDimensionalArray3 = {8, 9, 10, 11, 12};

        //Jagged Two Dimensional Array
        int[][] twoDimensionalArray = {OneDimensionalArray1, oneDimensionalArray2, oneDimensionalArray3};

        //Printing elements of Two Dimensional Array
        for (int i = 0; i < twoDimensionalArray.length; i++)
        {
            for (int j = 0; j < twoDimensionalArray[i].length; j++)
            {
                System.out.print(twoDimensionalArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
