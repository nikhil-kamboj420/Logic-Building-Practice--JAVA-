// *  Take a 3-digit number and check if the sum of the first and last digit equals the middle  digit.

import java.util.Scanner;

public class SumEqualCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number  : ");
        int num = sc.nextInt();
        sc.close();
        if (num >= 100 && num <= 999) {
            int digit1 = num / 100;
            int digit2 = (num / 10) % 10;
            int digit3 = num % 10;

            if (digit1 + digit3 == digit2) {
                System.out.println("Yes ! the sum of the first and last digit equals the middle  digit");
            } else {
                System.out.println("No ! the sum of the first and last digit is not equals the middle  digit");
            }

        } else {
            System.out.println("please enter a three digit number first.");
        }
    }
}
