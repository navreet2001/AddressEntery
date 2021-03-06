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
     * @param firstName
     * @param lastName
     * @param street
     * @param state
     * @param zip
     * @param phone
     * @param email
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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *  @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *  @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *  @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *  @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     *  @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *  @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     *  @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *  @return the state
     */
    public String getState() {
        return state;
    }

    /**
     *  @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *  @return the zip
     */
    public int getZip() {
        return zip;
    }

    /**
     *  @param zip the zip to set
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     *  @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *  @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *  @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     *  @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        return "FirstName=" + firstName + ", LastName=" + lastName + ", street=" + street + ", city="
                + city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + "";
    }
}