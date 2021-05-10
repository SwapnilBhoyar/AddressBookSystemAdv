import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String args[]) {
        ArrayList<AddressBook> adbook = new ArrayList<AddressBook>();
        int r = 0;
        String choice = "y";
        Scanner scan = new Scanner(System.in);
        AddressBook addressObject = new AddressBook();
        System.out.println("Wellcome to Address Book Program!");
        while (r != 3) {
            System.out.println("1.CREATE AN ADDRESS BOOK");
            System.out.println("2.ACCESS AN ADDRESS BOOK");
            System.out.println("3.EXIT THE APPLICATION");
            r = scan.nextInt();
            switch (r) {
                case 1:
                    System.out.println("Enter the name of address book to be created");
                    String name = scan.next();
                    AddressBook book = new AddressBook();
                    book.addressBookName = name;
                    adbook.add(book);
                    break;
                case 2:
                    int key = 0;
                    System.out.println("Enter the address book name to be accessed");
                    String accessBook = scan.next();
                    for (int j = 0; j < adbook.size(); j++) {
                        if (adbook.get(j).addressBookName.equalsIgnoreCase(accessBook)) {
                            int switchChoice = 0;
                            while (switchChoice != 5) {
                                System.out.println("Enter 1: add 2: edit 3: delete 4: view 5: exit");
                                System.out.println("Enter choice : ");
                                switchChoice = scan.nextInt();
                                scan.nextLine();
                                choice = "y";
                                switch (switchChoice) {
                                    case 1:
                                        while (choice.equals("y")) {
                                            System.out.println("Firstname : ");
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
                                            adbook.get(j).contactList.add(contact);
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Enter name of contact to edit : ");
                                        String nameToEdit = scan.nextLine();
                                        int i = 0;
                                        for (i = 0; i < adbook.get(j).contactList.size(); i++) {
                                            if (adbook.get(j).contactList.get(i).firstname.equalsIgnoreCase(nameToEdit)) {
                                                adbook.get(j).contactList.get(i).editContact();
                                            }
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Enter name of contact to delete : ");
                                        String deleteCon = scan.nextLine();
                                        for (i = 0; i < adbook.get(j).contactList.size(); i++) {
                                            if (adbook.get(j).contactList.get(i).firstname.equalsIgnoreCase(deleteCon)) {
                                                adbook.get(j).contactList.remove(i);
                                            }
                                        }
                                        break;

                                    case 4:
                                        System.out.println("Enter name of contact to view : ");
                                        String nameToView = scan.nextLine();
                                        for (i = 0; i < adbook.get(j).contactList.size(); i++) {
                                            if (adbook.get(j).contactList.get(i).firstname.equalsIgnoreCase(nameToView)) {
                                                adbook.get(j).contactList.get(i).printContactDetails();
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                    }
            }
        }
    }
}