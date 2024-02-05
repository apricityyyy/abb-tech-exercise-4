import java.util.Scanner;

public class PhoneNumberFormatChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the phone number:");
        String phoneNumber = scanner.next();

        PhoneNumber phoneNumberObject = new PhoneNumber(phoneNumber);
        System.out.println("The number you entered: " + phoneNumberObject.getPhoneNumber());
        phoneNumberObject.setPhoneNumber(phoneNumber);
    }
}
