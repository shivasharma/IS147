package Week5;

/**
 * Created by Shiva on 9/28/2016.
 */
public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println (str3);

        StringBuilder sb = new StringBuilder ("Hello");
        sb.append (",");
        sb.append ("World");
        System.out.println (sb);


        String str4 = "Hello";
        String str5 = "Hello";
        if (str4 == str5) {
            System.out.println ("Identical");

        } else {
            System.out.println ("Not identical");
        }

        String part1 = "Hello";
        String part2 = "World";
        String part3 = part1 + part2;
        String part4 = "HelloWorld";
        // if(part3.equals (part4)){ //to get accurate string comprision
        if (part3 == part4) {
            System.out.println ("Identical");
        } else {
            System.out.println ("Not identical");
        }


    }
}
