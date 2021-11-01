 public static void main(String[] student) {

         // Array with random number
        int[] myList = new int[2];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 100);
            System.out.println( myList[i] );
        }
        //Sum array values
       int total=0;
        for (int j = 0; j < myList.length; j++) {
           total+=myList[j];
        }
        System.out.println( total);
    }
