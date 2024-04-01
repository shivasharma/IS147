class MyClass{
    public int number;
    public String name;

  public MyClass(){
    number=20;
    name="Shiva";
  }
   //Initialization block
    {
        number=500;
    }
}

public class InitializationObject
{
   public static void main (String[] args){

     MyClass myClass=new MyClass();
     System.out.println(myClass.number);
     System.out.println(myClass.name);
   }
}
