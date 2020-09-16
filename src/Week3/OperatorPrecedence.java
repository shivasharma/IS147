
package Week3;

public class OperatorPrecedence {

    //result 19,5
    public static void main(String[] args) {
     int valueA=21;
     int valueB=6;
     int valueC=3;
     int valueD=1;
     //  21-2
     int result1=valueA-valueB/valueC;
     //21-6=15/3
     int result2=(valueA-valueB)/valueC;
     //13
     int result3= valueA/valueC*valueD+valueB;
     int result4=valueA/(valueC*(valueD+valueB))
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
