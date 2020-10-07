package Week6;

public class Loop {


    public static void main(String[] args) {

        System.out.println ("---------- While Loop---------");
        WhileLoop();

        System.out.println ("----------Do While Loop---------");
        DowhileLoop();

        System.out.println ("----------For Loop---------");
        ForLoop();
        
        System.out.println ("----------Nested Loop---------");
        NestedLoop();

    }

    public static void WhileLoop(){
        int i = 10;

        while( i < 20 ) {
            System.out.print("value of i : " + i );
            i++;
            System.out.print("\n");
        }
    }

    public static void DowhileLoop(){
        //Do while loop

        int u = 10;

        do{
            System.out.print("value of do while : " + u );
            u++;
            System.out.print("\n");
        }while( u < 20 );

    }

    public static void ForLoop(){
        for(int n = 10; n < 20; n = n+1) {
            System.out.print("value of n : " + n );
            System.out.print("\n");
        }
    }
    
    public static void NestedLoop(){
        for(int i=1;i<=3;i++){  
            //loop of j  
            for(int j=1;j<=3;j++){  
                    System.out.println(i+" "+j);  
            }//end of i  
            }//end of j  
    }

}



