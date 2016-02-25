package Week9;

/**
 * Created by Shiva on 10/21/2015.
 */
public class MultiDimensionArray {

    public static  void main(String[] args){
        int[ ][ ] aryNumbers = new int[2][5];

        aryNumbers[0][0] = 10;
        aryNumbers[0][1] = 12;
        aryNumbers[0][2] = 43;
        aryNumbers[0][3] = 11;
        aryNumbers[0][4] = 22;

        aryNumbers[1][0] = 20;
        aryNumbers[1][1] = 45;
        aryNumbers[1][2] = 56;
        aryNumbers[1][3] = 1;
        aryNumbers[1][4] = 33;


        int rows = 2;
        int columns = 5;

        int i, j;

        for (i=0; i < rows ; i++) {

            for (j=0; j < columns ; j++) {

                System.out.print( aryNumbers[ i ][ j ] + " " );

            }

            System.out.println( "" );

        }


    }
}
