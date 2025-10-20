//* Take a password string and check basic rules (length 2 8 and contains at least one digit).

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        Boolean hasDigit = (password.contains("0") || password.contains("1") || password.contains("2") ||
                password.contains("3") || password.contains("4") || password.contains("5") ||
                password.contains("6") || password.contains("7") || password.contains("8") ||
                password.contains("9"));
        if ((password.length() >= 8) && hasDigit) {
            System.out.println("Valid password!");
        } else if ((password.length() < 8) && !hasDigit) {
            System.out.println("Invalid password! Too short and no digit found.");
        } else if (password.length() < 8) {
            System.out.println("Invalid password! It must be at least 8 characters long.");
        } else {
            System.out.println("Invalid password! It must contain at least one digit.");
        }

        sc.close();

    }
}
