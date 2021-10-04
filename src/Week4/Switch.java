package Week4;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your classname for eg. IS147: ");
        String className = sc.nextLine();
        Showmyclass(className);
    }

    public static  void Showmyclass(String myclass) {
        switch (myclass) {
            case "IS310":

                System.out.println ("Software and Hardware Concepts");
                break;
            case "IS410":

                System.out.println ("Introduction to Database Design");
                break;
            case "IS403":

                System.out.println ("User Interface Design ");
                break;

            case "IS147":
            case "IS 147":
                System.out.println ("Introduction to Computer Programming");
                break;

            default:
                System.out.println ("Invalid class");
        }

    }

    public static void colorCode(){
        int colorCode = 101;
        String color = null;
        switch(colorCode) {
            case 100 :
                color = "Yellow";
                break;
            case 101 :
                color = "Green";
                break;
            case 102 :
                color = "Red";
                break;
            default :
                color = "Invalid";
        }
        System.out.println("Color ---&gt;"+color);
    }

    int colorCode = 101;
    String color = null;
    color=(colorCode==100)?"Yellow":((colorCode==101)?"Green":((colorCode==102)?"Red":"Invalid"));
    System.out.println("Color ---&gt;"+color);

}