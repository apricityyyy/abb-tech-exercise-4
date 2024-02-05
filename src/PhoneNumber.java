public class PhoneNumber {
    private String phoneNumber;

    PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String getPhoneNumber() {
        return this.phoneNumber;
    }

    void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 17) {
            if (phoneNumber.startsWith("+994")) {
                if (phoneNumber.startsWith("50", 5) ||
                        phoneNumber.startsWith("51", 5) ||
                        phoneNumber.startsWith("55", 5) ||
                        phoneNumber.startsWith("70", 5) ||
                        phoneNumber.startsWith("60", 5)) {
                    if (phoneNumber.matches("^\\+994-(?:50|51|55|70|60)-\\d{3}-\\d{2}-\\d{2}$")) {
                        this.phoneNumber = phoneNumber;
                        System.out.println("The phone number " + phoneNumber + " is valid.");
                    } else {
                        System.out.println("The format should be +994-[50/51/55/70/60]-000-00-00.");
                    }
                } else {
                    System.out.println("You can continue with 50/51/55/70/60 digits after +994.");
                }
            } else {
                System.out.println("The number should start with +994.");
            }
        } else {
            System.out.println("There should be 17 characters in the phone number. Check the format: +994-[50/51/55/70/60]-000-00-00.");
        }
    }
}
