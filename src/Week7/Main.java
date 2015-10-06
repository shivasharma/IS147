package Week7;



/**
 * Created by Shiva on 10/4/2015.
 */
public class Main {

    public static void main(String [] args){
        Person  person= new Person ();
        person.PrintName();
        String personName= person.GetPersonName("shiva");

        System.out.println(personName);


        Method method=new Method();
       int result= method.Printnumber(2,3);
        System.out.println(result);

    }
}



 class Method {

    public static int Printnumber(int x, int y){
        return x+y;
    }
}
;
