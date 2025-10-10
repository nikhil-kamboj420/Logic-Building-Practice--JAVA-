
//*  Take a character and check if it’s a vowel or consonant.
import java.util.Scanner;

public class IsVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        char ch = sc.next().toLowerCase().charAt(0);

        checkVowelOrConsonant(ch);
        sc.close();
    }

    static void checkVowelOrConsonant(char ch) {
        if (!Character.isLetter(ch)) {
            System.out.println("'" + ch + "' is not an alphabet");
            return;
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("'" + ch + "' is a vowel");
        } else {
            System.out.println("'" + ch + "' is a consonant");
        }
    }
}
