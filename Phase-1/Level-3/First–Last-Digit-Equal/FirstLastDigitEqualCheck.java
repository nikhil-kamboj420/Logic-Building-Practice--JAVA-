//* Take a 4-digit number and check if the first and last digits are equal.

import java.util.Scanner;

public class FirstLastDigitEqualCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();
        sc.close();
        if (num < 1000 || num > 9999) {
            System.out.println("Please enter a valid 4-digit number!");
            return;
        }

        int digit1 = num / 1000;
        int digit4 = num % 10;

        if (digit1 == digit4) {
            System.out.println("digit first '" + digit1 + "' and digit last '" + digit4 + "' both are equal");
        } else {
            System.out.println("digit first '" + digit1 + "' and digit last '" + digit4 + "' both are not equal");
        }

    }
}
