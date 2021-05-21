import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

    public void contactWithSameCity() {
        System.out.println("Enter city name to search contact's :");
        String citySearch = scan.nextLine();
        for (ContactDetail contact: contactList) {
            List<ContactDetail> personByCity = contactList.stream().filter(myContact -> myContact.getCity().equals(citySearch)).collect(Collectors.toList());
            for (ContactDetail myContact: personByCity) {
                System.out.println("Name:"+ contact.getFirstName()+" "+contact.getLastName());
            }
        }
    }

    public void contactWithSameState() {
        System.out.println("Enter state name to search contact's :");
        String stateSearch = scan.nextLine();
        for (ContactDetail contact: contactList) {
            List<ContactDetail> personByState = contactList.stream().filter(myContact -> myContact.getState().equals(stateSearch)).collect(Collectors.toList());
            for (ContactDetail myContact: personByState) {
                System.out.println("Name:"+ contact.getFirstName()+" "+contact.getLastName());
            }
        }
    }

    public void countWithSameCity() {
        System.out.println("Enter city name to search contact's :");
        String citySearch = scan.nextLine();
        for (ContactDetail contact: contactList) {
            List<ContactDetail> countByCity = contactList.stream().filter(myContact -> myContact.getCity().equals(citySearch)).collect(Collectors.toList());
            for (ContactDetail myContact: countByCity) {
                System.out.println("Number of people from "+citySearch+" are:"+ countByCity.stream().count());
            }
        }
    }

    public void countWithSameState() {
        System.out.println("Enter city name to search contact's :");
        String stateSearch = scan.nextLine();
        for (ContactDetail contact: contactList) {
            List<ContactDetail> countByState = contactList.stream().filter(myContact -> myContact.getCity().equals(stateSearch)).collect(Collectors.toList());
            for (ContactDetail myContact: countByState) {
                System.out.println("Number of people from "+stateSearch+" are:"+ countByState.stream().count());
            }
        }
    }
}