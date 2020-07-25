package Week8;


public class ArrayReturnMethod {


 public static void main(String [] args){

     double[] arrayStatsA = new double[3];           //These are used to store the returns of getArrayStats methods
     double[] arrayStatsB = new double[4];

     double[] arrayInputA = new double[50];          //These are "input" values generated randomly with each run.
     double[] arrayInputB = new double[50];
     double[][] arrayInputC = new double[50][50];
     boolean type = true;

     for (int i = 0; i < 50; i++)       //this loop populates the 1d arrays with random numbers between  0 <= n < 20
     {
         arrayInputA[i] = Math.random() * 20.0;
         arrayInputB[i] = Math.random() * 20.0;
     }

     for (int i = 0; i < 50; i++)       // this loop populates the 2d array with random numbers between 0 <= n < 20
     {
         for( int j = 0; j < 50; j++ )
         {
             arrayInputC[i][j] = Math.random() * 20;
         }
     }


        /*The following invokes getArrayStats( a[] ) and prints the results.*/

     arrayStatsA = getArrayStats( arrayInputA );

     System.out.println( "One Dimentional array:" );
     System.out.println();
     System.out.println( "Minimum = " + arrayStatsA[0] );
     System.out.println( "Maximum = " + arrayStatsA[2] );
     System.out.println( "Average = " + arrayStatsA[1] );
     System.out.println();
     System.out.println();

 }


    public static double[] getArrayStats(double[] input) {
        double[] result = {input[0], 0, input[0]}; // result array {min,avg,max}
        for (int i = 1; i < input.length; i++)       // find minimum.
        {
            if (input[i] < result[0])   //found a smaller value
                result[0] = input[i];   //make its value the new min
        }

        for (int i = 1; i < input.length; i++)       // find maximum.
        {
            if  ( input[i]>result[2])   //found a larger value
                result[2] = input[i];   //make its value the new max
        }

        for( int i = 1; i < input.length; i++ )      // calculate sum (for average
        {
            result[1]= result[1]+ input[i];
        }
        result[1]=result[1]/input.length;   //calculate average
        return result;

    }
}
