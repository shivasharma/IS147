
public class LogicalOperators {
 public static void main(String[] args) {


            logicalOperatorsAND();
            logicalOperatorsOR();
            logicalOperatorsNOT();
            exclusiveOR();
        }

        public static void logicalOperatorsAND() {
            boolean x = true;//boolean variable x is initialized with value true
            boolean y = false;//boolean variable y is initialized with value false
            boolean z = (x && y) ;//conditional-AND on x and y
            System.out.println("x && y = " + z);//print value of the result
            //This gives an output x && y = false
        }


        public static void logicalOperatorsOR (){

            boolean x = true;//boolean variable x is initialized with value true
            boolean y = false;//boolean variable y is initialized with value false
            boolean z = (x || y) ;  //conditional-OR on x and y
            System.out.println("x || y = " + z);//print value of the result
            //This gives an output x || y = true

        }

        public static void logicalOperatorsNOT() {
            boolean x = true;//boolean variable x is initialized with value true
            boolean z = !x; //  inverting the value of x
            System.out.println("z = " + z);//print value of the result
            //This gives output as z = false
        }

        public static void exclusiveOR (){
            boolean a = true;
            boolean b = false;
            boolean result = a ^ b;
            System.out.println("a ^ b: "+ result); //prints the result true

            a = true;
            b = true;
            result = a ^ b;
            System.out.println("a ^ b: "+ result); //prints the result false

            a = false;
            b = true;
            result = a ^ b;
            System.out.println("a ^ b: "+ result); //prints the result true

            a = false;
            b = false;
            result = a ^ b;
            System.out.println("a ^ b: "+ result); //prints the result false
        }
   }

