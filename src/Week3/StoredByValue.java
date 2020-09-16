
public class StoredByValue {
public static void main(String[] args) {
   int firstValue=100;
   int otherValue=firstValue;
    System.out.println(otherValue);
    firstValue=50;
    otherValue=70;
    System.out.println(firstValue);
    System.out.println(otherValue);

}
}