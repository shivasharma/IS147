package Week10;

/**
 * Created by Shiva on 11/4/2015.
 */
public class Employee {
    //instance data attribute of employee

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;
    private int employeeID;
    private int deptID;
    private String title;
    private double salary;
    protected  String SSN;

    //Constructor no return type and same name as class
    //
    public Employee(String fname, String lname, String phone, Address address,
                    int employeeID, int deptID, String title, double salary, String SSN) {
        firstName = fname;
        lastName = lname;
        phoneNumber = phone;
        //this reprents to instance data= calling program
        // it has same  name
        this.address = address;
        this.employeeID = employeeID;
        this.deptID = deptID;
        this.title = title;
        this.salary = salary;
        this.SSN=SSN;
    }

    //gettter:Accessor
    public String getName() {
        return firstName + " " + lastName;
    }
   //setter: Mutator
    public void setFirstName(String value) {
        firstName = value;
    }


    protected String getSSN(){
        return SSN;
    }

    protected String setSSN(String value){
        return SSN=value;
    }

    public void setLastName(String value) {
        lastName = value;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String value) {
        phoneNumber = value;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEEID() {
        return employeeID;
    }

    public void setEEID(int value) {
        employeeID = value;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int value) {
        deptID = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double value) {
        if (value <= 10000)
            System.out.println ("Error, invalid salary amount, salary was not updated");
        else
            salary = value;
    }

    public void printEmployee()
    {
        System.out.println(lastName +", "+firstName+"\nTitle: " + title +
                "\nAddress: " + address.toString() + "\n\nEmployee ID: " + employeeID );
        System.out.printf("Salary: $%8.2f", salary);
        System.out.println();
    }
}
