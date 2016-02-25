package Week5;

/**
 * Created by s.sharma on 2/25/2016.
 */
public class Interned {

    public static void main(String[] args) {

        String s1="Welcome to java";
        String s2=new String("Welcome to java");
        String s3="Welcome to java";

        System.out.println("s1==s2 is "+ (s1==s2));
        System.out.println("s1==s3 is "+ (s1==s3));

    }
}
