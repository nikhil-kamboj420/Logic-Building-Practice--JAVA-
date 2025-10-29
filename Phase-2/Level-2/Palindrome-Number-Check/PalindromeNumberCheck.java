// * Check if a given number is a Palindrome.

import java.util.Scanner;

public class PalindromeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int revNumber = 0;

        for (int i = num; i > 0; i /= 10) {
            int digit = i % 10;
            revNumber = revNumber * 10 + digit;
        }

        if (original == revNumber) {
            System.out.println("Yes, this number is a Palindrome.");
        } else {
            System.out.println("No, this number is not a Palindrome.");
        }

        sc.close();
    }
}
