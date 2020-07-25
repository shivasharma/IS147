package Week3;


public class HelperClass {
    public static void main(String[] args) {
        double doubleValue = 158.54d;
        Double doubleObj = new Double (doubleValue);

        Double data = new Double (12.56);
        System.out.println (data);
        double byteValue = doubleObj.floatValue ();

        System.out.println (doubleValue);
        System.out.println (doubleObj);
        System.out.println (byteValue);


    }
}
