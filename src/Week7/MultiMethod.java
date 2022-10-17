package Week7;


public class MultiMethod {


    public static void main (String [] args){
        
        System.out.println("Before calling  method");
        doSomething();
        System.out.println("After calling  method");
    }

    //void method
    public static void doSomething(){
        System.out.println("Message from doSomething method");
    }

}
