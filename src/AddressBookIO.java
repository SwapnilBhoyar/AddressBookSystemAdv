import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class AddressBookIO {
    public static String File = "AddressBook.txt";

    public void writeData(List<ContactDetail> contactsList) {
        StringBuffer buffer = new StringBuffer();
        contactsList.forEach(contact -> {
            String contactData = contact.toString().concat("\n");
            buffer.append(contactData);
        });
        try {
            Files.write(Paths.get(File), buffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printData() {
        try {
            Files.lines(new File("AddressBook.txt").toPath()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AddressBookIO addressBookIO = new AddressBookIO();
        ContactDetail[] arrayOfContact= {
            new ContactDetail("swapnil", "bhoyar", "camp", "pune", "maharashtra", "411001", "1234567890", "swapnil@gmail.com") ,
            new ContactDetail("aditya", "bhosale", "katraj", "pune", "maharashtra", "411111", "0987654321", "aditya@gmail.com")
        };

        addressBookIO.writeData(Arrays.asList(arrayOfContact));
        addressBookIO.printData();
    }
}
