public class AddressEntry {
    // Instance variables
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    /**
     * Default constructor
     */
    public AddressEntry() {
        super();
    }

    /**
     *  firstName
     *  lastName
     *  street
     *  state
     *  zip
     *  phone
     *  email
     */
    public AddressEntry(String firstName, String lastName, String street, String state, int zip, String phone,
                        String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     *  the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *  firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *  the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *  lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *  the street
     */
    public String getStreet() {
        return street;
    }

    /**
     *  street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *  the city
     */
    public String getCity() {
        return city;
    }

    /**
     *  city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *  the state
     */
    public String getState() {
        return state;
    }

    /**
     *  state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *  the zip
     */
    public int getZip() {
        return zip;
    }

    /**
     *  zip the zip to set
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     *  the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *  phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *  the email
     */
    public String getEmail() {
        return email;
    }

    /**
     *  email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        return "FirstName=" + firstName + ", LastName=" + lastName + ", street=" + street + ", city="
                + city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + "";
    }
}

}
