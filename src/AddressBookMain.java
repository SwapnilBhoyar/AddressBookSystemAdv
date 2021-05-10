public class AddressBookMain {
    public static void main(String args[]) {
        System.out.println("Wellcome to Address Book Program!");

        ContactDetail contact = new ContactDetail("Swapnil", "Bhoyar", "Camp", "Pune", "Maharashtra", "411001", "9876543210", "swapnilbhoyar@gmail.com");
        contact.printContactDetails();
    }
}
