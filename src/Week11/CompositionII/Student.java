package Week11.CompositionII;

/**
 * Created by Shiva on 11/11/2015.
 */
public class Student {

    int roll;
    String sname;
    Address address;

    Student(int rollNo,Address addressDetail){
        roll = rollNo;
        address = addressDetail;
    }

    void printStudentDetails(Address address1) {
        System.out.println("Roll   : " + roll);
        System.out.println("Street : " + address1.street);
        System.out.println("City   : " + address1.city);
        System.out.println("State  : " + address1.state);
        System.out.println("Zip    : " + address1.zip);
    }
}
