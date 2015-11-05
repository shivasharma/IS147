package Week10;

/**
 * Created by Shiva on 11/4/2015.
 */
 public  class StaticPerson {



    private static String firstName="Shiva";
    private static String lastName="Sharma";

    public StaticPerson(String fname, String lname) {
        fname = firstName;
        lastName = lname;
    }

    public static String getName() {
        return firstName + " " + lastName;
    }

    //setter: Mutator
    public static void setFirstName(String value) {
        firstName = value;
    }

    static{
        System.out.println("static block of parent class");
    }

//}
}