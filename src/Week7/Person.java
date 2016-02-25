package Week7;

/**
 * Created by Shiva on 10/4/2015.
 */
public  class Person {


    private String name ="";
    private int age=0;
    private  double height=0.0d;


    // Method that return name
    public String GetPersonName(String name){
           return name;
    }

    //void method does not have any return type
    public void PrintName(){
        System.out.println("Private method printName");
    }


    public  int Printnumber(int x, int y){
        return x+y;
    }
    public  int Printnumber(int x, int y,int z){
        return x+y+z;
    }
    public  int Printnumber(int x, int y,int z,int a){
        return x+y+z+a;
    }
}
