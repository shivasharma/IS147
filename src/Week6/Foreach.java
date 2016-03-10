package Week6;

/**
 * Created by s.sharma on 3/10/2016.
 */


    public class Foreach {
        public static void main(String[] args) {
            int[] intary = { 1,2,3,4};
            forDisplay(intary);
            foreachDisplay(intary);
        }
        public static void forDisplay(int[] a){
            System.out.println("Display an array using for loop");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        public static void foreachDisplay(int[] data){
            System.out.println("Display an array using for each loop");
            for (int a  : data) {
                System.out.print(a+ " ");
            }
        }
    }

