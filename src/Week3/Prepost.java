package Week3;


public class Prepost {

    public static void main(String[] args) {

        //prefix increment before
        int someValue=5;
        System.out.println(++someValue);
        System.out.println(someValue);

        //postfix increment after
        int someOtherValue=5;
        System.out.println(someOtherValue++);
        System.out.println(someOtherValue);


        int num=0;
        int count=4;
        System.out.println ("If num is : "+num+" and count is: "+count);
        num=count++;
        System.out.println ("Your postfix result of num=count++ is num= "
                + num + " and count= " + count );
       num=0;
        count=4;
        num=++count;
        System.out.println ("Your prefix  result of num=++count is num= "+num + " and count= " + count);


    }
}