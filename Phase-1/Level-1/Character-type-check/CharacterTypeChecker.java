// * Take a character and check whether it’s uppercase, lowercase, a digit, or a special character.
import java.util.Scanner;

public class CharacterTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0); 
        sc.close();

        checkCharacterType(ch);
    }

    static void checkCharacterType(char ch) {
        if (Character.isUpperCase(ch)) {
            System.out.println("'" + ch + "' is an Uppercase Letter");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("'" + ch + "' is a Lowercase Letter");
        } else if (Character.isDigit(ch)) {
            System.out.println("'" + ch + "' is a Digit");
        } else {
            System.out.println("'" + ch + "' is a Special Character");
        }
    }
}
