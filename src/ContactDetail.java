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
