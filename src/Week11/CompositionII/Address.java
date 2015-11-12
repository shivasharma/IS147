package Week11.CompositionII;

/**
 * Created by Shiva on 11/11/2015.
 */
public class Address {
    String street;
    String state;
    String zip;
    String city;

    public Address(String street, String city,
                   String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
