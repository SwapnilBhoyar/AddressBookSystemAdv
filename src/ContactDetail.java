import java.util.Scanner;

public class ContactDetail {
        public String firstname, lastname;
        public String address, city, state;
        public String zip;
        public String phoneNumber;
        public String email;

        public ContactDetail(String firstname, String lastname, String address, String city, String state, String zip, String phonenumber, String email) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phonenumber;
            this.email = email;
        }

        public String getFirstName() {
            return firstname;
        }
        public void setFirstName(String firstName) {
            this.firstname = firstName;
        }
        public String getLastName() {
            return lastname;
        }
        public void setLastName(String lastName) {
            this.lastname = lastName;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getState() {
            return state;
        }
        public void setState(String state) {
            this.state = state;
        }
        public String getZip() {
            return zip;
        }
        public void setZip(String zip) {
            this.zip = zip;
        }
        public String getPhoneNo() {
            return phoneNumber;
        }
        public void setPhoneNo(String phno) {
            this.phoneNumber = phno;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public void editContact() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Edit Firstname : ");
            String firstname = sc.nextLine();
            setFirstName(firstname);

            System.out.println("Edit Lastname : ");
            String lastname = sc.nextLine();
            setLastName(lastname);

            System.out.println("Edit Address : ");
            String address = sc.nextLine();
            setAddress(address);

            System.out.println("Edit City : ");
            String city = sc.nextLine();
            setCity(city);

            System.out.println("Edit State : ");
            String state = sc.nextLine();
            setState(state);

            System.out.println("Edit Zip : ");
            String zip = sc.nextLine();
            setZip(zip);

            System.out.println("Edit PhoneNumber : ");
            String phonenumber = sc.nextLine();
            sc.nextLine();
            setPhoneNo(phonenumber);

            System.out.println("Edit Email : ");
            String email = sc.nextLine();
            setEmail(email);
        }

        public void printContactDetails() {
            System.out.println("Firstname : " + firstname);
            System.out.println("Lastname : " + lastname);
            System.out.println("Address : " + address);
            System.out.println("City : " + city);
            System.out.println("State : " + state);
            System.out.println("Zip : " + zip);
            System.out.println("PhoneNumber : " + phoneNumber);
            System.out.println("Email : " + email);
        }
}
