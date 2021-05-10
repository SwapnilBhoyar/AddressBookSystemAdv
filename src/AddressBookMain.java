import java.util.Scanner;

public class AddressBookMain {
    public static void main(String args[]) {
        System.out.println("Wellcome to Address Book Program!");

        AddressBook addressObject = new AddressBook();
        String choice = "y";
        System.out.println("Wellcome to Address Book Program!");

        while(choice.equals("y") || choice.equals("Y")) {
            System.out.println("Firstname : ");
            Scanner scan = new Scanner(System.in);
            String firstname = scan.nextLine();
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
            System.out.println("Do you want add more contact : ");
            choice = scan.nextLine();

            ContactDetail contact = new ContactDetail(firstname, lastname, address, city, state, zip, phonenumber, email);
            addressObject.insertContact(contact);
        }
        ContactDetail contact = new ContactDetail("Swapnil", "Bhoyar", "Camp", "Pune", "Maharashtra", "411001", "9876543210", "swapnilbhoyar@gmail.com");
        contact.printContactDetails();
    }
}
