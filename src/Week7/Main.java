package Week7;



/**
 * Created by Shiva on 10/4/2015.
 */
public class Main {

    public static void main(String [] args){
        Person  person= new Person ();
       // person.name="shiva";
       // System.out.println (person.name);

         int sum = person.Printnumber (2, 3);
        System.out.println (sum);
        int sum1 = person.Printnumber (2, 3,5);
        System.out.println (sum1);

        int sum2 = person.Printnumber (2, 3,5,7);
        System.out.println (sum2);
    }
}


/*
class Method {

    public static int Printnumber(int x, int y){
        return x+y;
    }
}*/
