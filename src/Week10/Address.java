package Week10;

/**
 * Created by Shiva on 11/4/2015.
 */
public class Address {
    private String houseNumber;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;

    public Address(String houseNum, String address1, String address2,
                   String city, String state, String zip)
    {
        houseNumber = houseNum;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zip;
    }
    public Address(String houseNum, String address1,
                   String city, String state, String zip)
    {
        houseNumber = houseNum;
        this.address1 = address1;
        this.address2 = "";
        this.city = city;
        this.state = state;
        this.zipcode = zip;
    }

}
