import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<ContactDetail> contactList = new ArrayList<ContactDetail>();
    String addressBookName,firstname;
    Scanner scan = new Scanner(System.in);
    int i;
    ContactDetail contactDetailObject = new ContactDetail();
    
    boolean checkDuplicate() {
        System.out.println("Firstname : ");
        firstname = scan.nextLine();
        for (ContactDetail contact: contactList) {
            if(contact.firstname.equals(firstname)) {
                System.out.println("Contact already exist");
                return true;
            }
        }
        return false;
    }
    
    public void addContactDetails() {
        if(!checkDuplicate()) {
            System.out.println("Lastname : ");
            String lastname = scan.nextLine();
            System.out.println("Address : ");
            String address = scan.nextLine();
            System.out.println("City : ");
            String city = scan.nextLine();
            System.out.println("State : ");
            String state = scan.nextLine();
            System.out.println("Zip : ");
            String zip = scan.nextLine();
            System.out.println("PhoneNumber : ");
            String phonenumber = scan.nextLine();
            System.out.println("Email : ");
            String email = scan.nextLine();

            ContactDetail contact = new ContactDetail(firstname, lastname, address, city, state, zip, phonenumber, email);
            contactList.add(contact);
        }
    }

    public void editContact() {
        System.out.println("Enter name of contact to edit : ");
        String nameToEdit = scan.nextLine();
        for (i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).firstname.equalsIgnoreCase(nameToEdit)) {
                System.out.println("Edit Firstname : ");
                String firstname = scan.nextLine();
                contactList.get(i).setFirstName(firstname);

                System.out.println("Edit Lastname : ");
                String lastname = scan.nextLine();
                contactList.get(i).setLastName(lastname);

                System.out.println("Edit Address : ");
                String address = scan.nextLine();
                contactList.get(i).setAddress(address);

                System.out.println("Edit City : ");
                String city = scan.nextLine();
                contactList.get(i).setCity(city);

                System.out.println("Edit State : ");
                String state = scan.nextLine();
                contactList.get(i).setState(state);

                System.out.println("Edit Zip : ");
                String zip = scan.nextLine();
                contactList.get(i).setZip(zip);

                System.out.println("Edit PhoneNumber : ");
                String phonenumber = scan.nextLine();
                contactList.get(i).setPhoneNo(phonenumber);

                System.out.println("Edit Email : ");
                String email = scan.nextLine();
                contactList.get(i).setEmail(email);
            }
        }
    }

    public void deleteContact() {
        System.out.println("Enter name of contact to delete : ");
        String deleteCon = scan.nextLine();
        for (i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).firstname.equalsIgnoreCase(deleteCon)) {
                contactList.remove(i);
            }
        }
    }

    public void printContactDetails() {
        System.out.println("Enter name of contact to view : ");
        String nameToView = scan.nextLine();
        for (i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).firstname.equalsIgnoreCase(nameToView)) {
                System.out.println("Firstname : " + contactList.get(i).firstname);
                System.out.println("Lastname : " + contactList.get(i).lastname);
                System.out.println("Address : " + contactList.get(i).address);
                System.out.println("City : " + contactList.get(i).city);
                System.out.println("State : " + contactList.get(i).state);
                System.out.println("Zip : " + contactList.get(i).zip);
                System.out.println("PhoneNumber : " + contactList.get(i).phoneNumber);
                System.out.println("Email : " + contactList.get(i).email);
            }
        }
    }
}
