package Week5;


public class Interned {

    public static void main(String[] args) {

         String s1 = "Welcome to java";
        String s2 = "Welcome to java";
        String s3 = "Welcome to java";

        System.out.println("s1==s2 is "+ (s1==s2));
        System.out.println("s1==s3 is "+ (s1==s3));
        System.out.println("s2==s3 is "+ (s2==s3));


        String s4= new String("Welcome to java");
        System.out.println("s1==s4 is "+ (s1==s4));

    }
}
