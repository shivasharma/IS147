public class Dog{
    private String name;
    private int age;
    public Dog(){
        this("ABC",1);
    }
//this refer to the dog object here
// this  operator cannot be used on static method
    public Dog (String name, int age){
        this.name=name;
        this.age=age;
    }
    //this is invalid
 /*
  public static void doSomeThing(){
        this.name;
    }
    */
    public void setName(string name){
        //this set the local name value
        name=name;

        this.name=name;
    }

    public string getName(){
        return this.name;
    }
    public void bark(){
        System.out.println("Dog bark");
    }
}