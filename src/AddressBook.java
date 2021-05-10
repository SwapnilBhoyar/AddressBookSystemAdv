import java.util.ArrayList;

public class AddressBook {
    private ArrayList<ContactDetail> contactList = new ArrayList<ContactDetail>();

    public void insertContact(ContactDetail contactDetailObject) {
        contactList.add(contactDetailObject);
    }
}
