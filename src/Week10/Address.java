package Week10;


public class Address {
    private final String houseNumber;
    private final String address1;
    private final String address2;
    private final String city;
    private final String state;
    private final String zipcode;

    public Address(String houseNum, String address1, String address2,
                   String city, String state, String zip) {
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
