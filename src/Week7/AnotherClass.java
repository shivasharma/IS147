package Week7;

/**
 * Created by s.sharma on 10/5/2015.
 */
public class AnotherClass {
    static String str="Useful to Define objects";

    public static void Greeting(){
        System.out.println("Hello from another class");
    }


}


class MainClass{

    public static void main(String[] test){
        System.out.println("Hello from the Main class");
        AnotherClass.Greeting();
        System.out.println(AnotherClass.str);

    }
}