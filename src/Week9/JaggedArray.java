	   // Declare a 2-D array with 3 rows
       int myarray[][] = new int[3][];
 
       // define and initialize jagged array
 
       myarray[0] = new int[]{1,2,3};
       myarray[1] = new int[]{4,5};
       myarray[2] = new int[]{6,7,8,9,10};
 
       // display the jagged array
       System.out.println("Two dimensional Jagged Array:");
       for (int i=0; i&lt;myarray.length; i++)
       {
          for (int j=0; j&lt;myarray[i].length; j++)
              System.out.print(myarray[i][j] + " ");
          System.out.println();
        }
