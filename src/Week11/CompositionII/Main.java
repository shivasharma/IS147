package Week11.CompositionII;

/**
 * Created by Shiva on 11/11/2015.
 */
public class Main {

    public static void main(String[] args) {
        Address address1;
        address1 = new Address("Hilltop Circle","Baltimore","MD","21250");
        Student s1 = new Student(1,address1);
        s1.printStudentDetails(address1);
    }
}
