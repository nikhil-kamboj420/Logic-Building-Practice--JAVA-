//* Take a character and check if it is a letter, a digit, or neither.

import java.util.Scanner;

public class CharacterTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character : ");
        char ch = sc.nextLine().charAt(0);
        sc.close();
        checkCharacterType(ch);
    }

    static void checkCharacterType(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("'" + ch + "' is a Letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("'" + ch + "' is a Digit");
        } else {
            System.out.println("'" + ch + "' is neither a Letter nor a Digit");
        }
    }
}


