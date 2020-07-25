package Week11.InheritanceII;



class Calculation{
     public int z;
    public void addition(int x, int y){
        z=x+y;
        System.out.println("The sum of the given numbers:"+z);
    }
    public void Substraction(int x,int y){
        z=x-y;
        System.out.println("The difference between the given numbers:"+z);
    }

}

public class MyCalculation extends Calculation {

    public void multiplication(int x, int y){
        z=x*y;
        System.out.println("The product of the given numbers:"+z);
    }


    public static void main(String[] args) {
        int a = 20, b = 10;
        MyCalculation demo = new MyCalculation();

        demo.z = 10;
        System.out.println(demo.z);
        demo.addition(a, b);
        demo.Substraction(a, b);
        demo.multiplication(a, b);

    }
}
