package Week9;

/**
 * Created by Shiva on 10/21/2015.
 */
public class RaggedArray {

    public static void main(String[] args)
    {

        int[][] arrayNumbers = new int[2][6];
        arrayNumbers[0][0] = 1;
        arrayNumbers[0][1] = 2;
        arrayNumbers[0][2] = 3;
        arrayNumbers[0][3] = 4;
        arrayNumbers[0][4] = 5;

        double[][]arrayDouble = new double [2][6];
        arrayDouble [0][0] = 1.1;
        arrayDouble [0][1] = 2.2;
        arrayDouble [0][2] = 3.3;
        arrayDouble [0][3] = 4.4;
        arrayDouble [0][4] = 5.5;

        char[] arrayChar = {'h','e','l','l','o'};


        int rows = 2;
        int columns = 5;

        int i,j;

        for (i=0; i<rows ; i++){
            for (j=0; j< columns ; j++){
                System.out.print(arrayNumbers[i][j]+"");
            }

            System.out.print("");
        }

    }
    }

