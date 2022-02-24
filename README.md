address = contains AddressBookApplciation class and Menu class
address.data = contains AddressEntry, AddressBook
AddressBook - this class represents and contains a possibly every growing and/or shrinking "list" of AddressEntries. It allows for various operations such as search/find, addition and removal of AddressEntries.
you need to think about the efficiency of operations needed --see below example session --list alphabetic order (sorted), add, remove, find (search), read in from file

AddressEntry - this class represents a single Address/Contact information entry in the AddressBook
It should contain contructors, at least one constructor…one that accepts a first, last name, street, city, state, zip, email, phone.
contain separate class varaibles representing all the information in an AddressEntry contact.
It should cotain a toString() method that returns a nicely formats a string containing all contact information for printing to console
It should contain setX() and getX() methods where X are the class variables. (for example, setName(***) and getName() where *** are appropriate parameter(s) )

AddressBookApplication - this contains the main application class.
Uses Menu classes and AddressBook as described in this document
modify your previous exercise versions of AddressBook main method to create any objects necessary and then call Menu's displayMenu() method, capture the user's input choice, and appropriately call appropriate methods

Menu- this class is used to display menu options to the user.
displayMenu() method display the program options a-f shown below (also see example session):
a) Loading of entries from a file.
b) Addition - prompting user for information to be used to create a new AddressEntry
c) Removal - removing of an AddressEntry from the AddressBook. First a find is done (see below example session) and then the user selects from the find results what entry to remove.
d) Find - prompts users for the begining of the users last name (they can enter a complete last name or just the start....all entries with that as the first part of their last name will be displayed). Note in the case when more then one entry is found a set will be returned.
e) Listing - listing (a "dump") of the addresses in alphabetic order by the person's last name.
f) Quit -note we are NOT saving any newly created AddressEntry objects (or removing objects either are not updated to the file) to the file, this data is lost, we will handle this issue in Project 2 when we store data more apporpriately in a database.
NOTE: alter the prompt_* methods so that now they not only print out the prompt but, wait for the User to type into standard input and reads in the value and as necessary (for zip which is of type int) converts to appropriate type and returns that value. So prompt_Email() will ask user for Email read in what they typed and and returns a String. For prompt_Zip() it asks user for a zip and reads in value and converts to an int and returns this.
