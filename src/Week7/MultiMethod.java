package Week7;


public class MultiMethod {


    public static void main (String [] args){
        
        System.out.println("Before calling  method");
        doSomething();
        System.out.println("After calling  method");
        
         System.out.println("The max value is " + max(5,2));
    }

    //void method
    public static void doSomething(){
        System.out.println("Message from doSomething method");
    }
    
     public static int max(int num1,num2){
    int result;
	if(num1>num2){
	  result=num1;
	}else{
	result=num2
	}
	return result;
   }

}
