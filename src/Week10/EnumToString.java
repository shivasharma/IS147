package Week10;

/**
 * Created by Shiva on 11/1/2015.
 */
public class EnumToString {
    public static void main(String[] args)
    {
        // loop through the enum values, calling the
        // enum toString method for each enum constant
        for (Day d: Day.values ())
        {
            System.out.println(d);
        }
        System.out.println ("---------------------------");
        for (Day d: Day.values())
        {
            System.out.println(d.toString());
        }
    }
}

enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
