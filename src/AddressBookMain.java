import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    private static ArrayList<AddressBook> adbook = new ArrayList<AddressBook>();
    public static void main(String args[]) {

        int r = 0;
        String choice = "y";
        Scanner scan = new Scanner(System.in);
        AddressBook addressObject = new AddressBook();
        System.out.println("Wellcome to Address Book!");
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
                                System.out.println("Enter \n1: add \n2: edit \n3: delete \n4: view \n5: View persons in same city \n6: View persons in same state " +
                                                    "\n7: count of people from same city \n8: count of people from same state \n9: sort contact \n10: exit");
                                System.out.println("Enter choice : ");
                                switchChoice = scan.nextInt();
                                choice = "y";
                                switch (switchChoice) {
                                    case 1:
                                        while (choice.equals("y")) {
                                            addressObject.addContactDetails();
                                            System.out.println("Do you want add more contact : ");
                                            choice = scan.next();
                                        }
                                        break;

                                    case 2:
                                        addressObject.editContact();
                                        break;

                                    case 3:
                                        addressObject.deleteContact();
                                        break;

                                    case 4:
                                        addressObject.printContactDetails();
                                        break;

                                    case 5:
                                        addressObject.contactWithSameCity();
                                        break;

                                    case 6:
                                        addressObject.contactWithSameState();
                                        break;

                                    case 7:
                                        addressObject.countWithSameCity();
                                        break;

                                    case 8:
                                        addressObject.countWithSameState();
                                        break;

                                    case 9:
                                        addressObject.sortContact(adbook);
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