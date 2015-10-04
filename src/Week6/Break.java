package Week6;

/**
 * Created by s.sharma on 10/1/2015.
 */
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
