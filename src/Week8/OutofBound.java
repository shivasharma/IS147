package Week8;

/**
 * Created by Shiva on 10/14/2015.
 */
public class OutofBound {

    public static void main(String[] args) {
        Arrayoutofbound ();
    }


    public static void Arrayoutofbound() {
        char[] matrix = new char[]{'H', 'e', 'l', 'l', 'o'};

        System.out.println (matrix);
          /* Print each letter of the char array in a separate line. */
        // valid matrix [0.4]

        for (int i = 0; i <= matrix.length; ++i) {

            System.out.println (matrix[i]);

        }

    }
}