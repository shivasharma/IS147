public class Dog{
    private String name;
    private int age;
//this refer to the dog object here
    public Dog (String name, int age){
        this.name=name;
        this.age=age;
    }

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