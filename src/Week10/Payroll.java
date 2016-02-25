package Week10;

/**
 * Created by Shiva on 11/4/2015.
 */
public class Payroll {
    public static void main(String[] args) {
        Address a1 = new Address ("123", "South Main Street", "Cleveland", "OH", "12345");
        Address a2 = new Address ("123", "North Main Street", "Willoughby", "OH", "54321");


        Employee ee1 = new Employee ("Peggy", "Fisher", "717-555-1212", a1, 955123, 003, "Lecturer", 45000.00,"123-456-7777");
        Employee ee2 = new Employee ("Bob", "Fisher", "717-555-1212", a1, 955123, 003, "Lecturer", 45500.00,"345-345-5545");


        ee1.printEmployee ();
        ee2.printEmployee ();


    }
}