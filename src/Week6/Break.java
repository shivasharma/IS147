package Week6;


public class Break {

    public static void main(String []args){
        int i=0;
        while(i<6){
            if(i==3) break;
            i++;
        }
        System.out.println("Loop stopped at " +i);
    }
}
