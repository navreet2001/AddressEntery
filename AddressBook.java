import java.util.ArrayList;

public class AddressBook {
    /**
     * Instance variable
     */
    private ArrayList<AddressEntry> addressEntryList=new ArrayList<>();
    /**
     * list method print the details of addressEntryList
     */
    public void list() {
        for(AddressEntry addressEntry:addressEntryList) {
            System.out.println(addressEntry);
        }
    }
    /**
     *
     * @param addressEntry add to addressEntryList
     */
    public void add(AddressEntry addressEntry) {
        addressEntryList.add(addressEntry);
    }
    public void initAddressBookExercise() {
        /**
         * Create an object of AddressEntry
         */
        AddressEntry addressEntry1=new AddressEntry();
        AddressEntry addressEntry2=new AddressEntry("Navreet", "Saini", "Aborn",
                "California", 95148, "4089811500", "navreetksaini19@gmail.com");
        addressEntry2.setCity("San Jose");
        /**
         * Call add method
         */
        add(addressEntry1);
        add(addressEntry2);
        /**
         * Call list method
         */
        list();
    }
}

