import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<ContactDetail> contactList = new ArrayList<ContactDetail>();
    Scanner sc = new Scanner(System.in);

    public void insertContact(ContactDetail ContactDetailObject) {
        contactList.add(ContactDetailObject);
    }

    public void editContact(String nameToEdit) {
        for(ContactDetail editContact: contactList) {
            if(editContact.getFirstName().equals(nameToEdit)) {

                System.out.println("Edit Firstname : ");
                String firstname = sc.nextLine();
                editContact.setFirstName(firstname);

                System.out.println("Edit Lastname : ");
                String lastname = sc.nextLine();
                editContact.setLastName(lastname);

                System.out.println("Edit Address : ");
                String address = sc.nextLine();
                editContact.setAddress(address);

                System.out.println("Edit City : ");
                String city = sc.nextLine();
                editContact.setCity(city);

                System.out.println("Edit State : ");
                String state = sc.nextLine();
                editContact.setState(state);

                System.out.println("Edit Zip : ");
                String zip = sc.nextLine();
                editContact.setZip(zip);

                System.out.println("Edit PhoneNumber : ");
                String phonenumber = sc.nextLine();
                sc.nextLine();
                editContact.setPhoneNo(phonenumber);

                System.out.println("Edit Email : ");
                String email = sc.nextLine();
                editContact.setEmail(email);
            }
        }
    }

    public void delete(String nameToDelete) {
        int i=0;
        for(i=0;i<contactList.size();i++) {
            if(contactList.get(i).firstname.equals(nameToDelete)) {
                contactList.remove(i);
                System.out.println("Contact is Deleted");
            }
            else {
                System.out.println("Contact not found!");
            }
        }
    }

    public void printContactDetails() {
        for(ContactDetail getInfo: contactList) {
            System.out.println("Firstname : " + getInfo.getFirstName());
            System.out.println("Lastname : " + getInfo.getLastName());
            System.out.println("Address : " + getInfo.getAddress());
            System.out.println("City : " + getInfo.getCity());
            System.out.println("State : " + getInfo.getState());
            System.out.println("Zip : " + getInfo.getZip());
            System.out.println("PhoneNumber : " + getInfo.getPhoneNo());
            System.out.println("Email : " + getInfo.getEmail());
        }
    }
}
