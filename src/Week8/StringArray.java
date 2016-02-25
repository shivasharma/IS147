package Week8;

/**
 * Created by Shiva on 10/14/2015.
 */
public class StringArray {

    public static  void main(String[] args){

        String[] days= new String[7];
        days[0]="Sunday";
        days[1]="Monday";
        days[2]="Tuesday";
        days[3]="Wednesday";
        days[4]="Thursday";
        days[5]="Friday";
        days[6]="Saturday";
        System.out.println ("Days");
        for (int i=0; i<days.length;i++){

            System.out.println ( days[i]);
        }
    }
}
