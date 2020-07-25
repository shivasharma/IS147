package Week8;


public class ArrayDefaultValue {


        public static void main(String[] args) {
            int[] values = new int[5];
            for (int i = 1; i < 5; i++) {
                values[i] = i + values[i-1];
                System.out.println ( " Value at index " + i + " is "+ values[i]);
            }
            values[0] = values[1] + values[4];
            System.out.println (" Value at index 0 " + values[0]);
        }


}
