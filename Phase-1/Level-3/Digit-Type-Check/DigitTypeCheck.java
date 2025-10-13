
//* Check whether a given integer is single-digit, double-digit, or multi-digit.
import java.util.Scanner;

public class DigitTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Integer : ");
        int digit = sc.nextInt();
        sc.close();
        digit = Math.abs(digit);

        if (digit >= 0 && digit <= 9) {
            System.out.println("The number  is a Single-digit number .");
        } else if (digit >= 10 && digit <= 99) {
            System.out.println("The number  is a Double-digit number .");
        } else {
            System.out.println("The number  is a Multi-digit number .");
        }
    }
}
