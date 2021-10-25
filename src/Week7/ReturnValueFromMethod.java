package Week7;


public class ReturnValueFromMethod {

    public static void main(String[] args)
    {

        int z=max(10,20);
        System.out.println(z);

       int number=25;
        System.out.println( number + " is " + sub(number));

        if(sub2(number)){
            System.out.println( number + " is above 10");
        }
    }


    public static int max (int num1,int num2){
        int result;
        if(num1>num2){
            result=num1;
        }else{
            return =num2;
        }
        return result;
    }

    private static String sub(int num) {
      return (num%2==0)?"even":"odd";
    }

    private static boolean sub2(int num){
        return num > 10;
    }
}
