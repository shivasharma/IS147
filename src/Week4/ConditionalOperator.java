public class ConditionalOperator {
   public static void main(String[] args) {
        conditional_operator1();
        conditional_operator2();
    }
    public static void conditional_operator1(){
        int x = 0;
        int y = 0;
        if (x > 0) {
            y = 1;
        } else {
            y = -1;

        }
        System.out.println( "Printing first y" +y);

        y = (x > 0) ? 1 : -1;
        System.out.println("Printing second y" +y);
    }
    public static void conditional_operator2(){
        int num=5;
        if (num % 2 == 0)
            System.out.println(num + "is even");
        else
            System.out.println(num + " is odd");

    }
}


