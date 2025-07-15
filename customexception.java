import java.util.Scanner;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

 class RecruitmentPhoneValidator {
    public static void validatePhone(String phone) throws InvalidPhoneNumberException {
        if (!phone.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter applicant's phone number: ");
        String phone = scanner.nextLine();

        try {
            validatePhone(phone);
            System.out.println("Phone number is valid. Proceeding with recruitment process.");
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }

        scanner.close();
    }
}
