package Week10;

/**
 * Created by Shiva on 11/4/2015.
 */

public class Car
{

    // create 4 private properties make, model,price,year
     private String make;

    //create default constructor


    //create parameterized constructor which takes 4 parameters
    //pass and assign properties
    public Car(String make, ......... , ......, .....){
        this.make=make;
        .........
        ........
        ......
        .....
    }



    // define Getter and setter methods for all properties
    private String getMake() {
        return make;
    }

    private void setMake(String make) {
        this.make = make;
    }

    //create rest getter and setter

    public String toString() {

        return "Make of Car: " + getMake() + "\n Model of Car: " + getModel()
                + "\n Price of Car: " + getPrice() + "\n Year of Car: " + getYear();

    }

}


class TestOverloading
{
    public static void main(String args[])
    {

        //create car object


        // call car object constructor and assign values

        //call setMake method

        //call getMake method

        //call toString methdd


    }
}
