/**
 * Created by Shiva Sharma IS147 on 11/20/2023
 * Person class for storing person information
 * Person call with fields,
 */


public class Person {
    /**
     * name of a person
     */
    private String name;

    /**
     * This is a construction to initialize person object
     *
     * @param name inital person name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Display person name
     *
     * @return person name
     */
    public String getName() {
        return "This method will display a person naem" + name;
    }

    /**
     * To set a person name
     *
     * @param name a new person name pass the string variable <code>String</code>
     */
    public void setName(String name) {
        this.name = name;
    }
}



