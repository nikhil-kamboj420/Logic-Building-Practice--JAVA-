//* Take an integer (1—9999) and check if the sum of its digits is greater than the product of its digits.

import java.util.Scanner;

public class SumVsProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (1-9999): ");
        int num = sc.nextInt();
        sc.close();

        if (num < 1 || num > 9999) {
            System.out.println("Please enter a valid number between 1 and 9999.");
            return;
        }

        int sum = 0, product = 0;
        if (num >= 1 && num <= 9) {
            int d1 = num;
            sum = d1;
            product = d1;
        } else if (num >= 10 && num <= 99) {
            int d1 = num / 10;
            int d2 = num % 10;
            sum = d1 + d2;
            product = d1 * d2;
        } else if (num >= 100 && num <= 999) {
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;
            sum = d1 + d2 + d3;
            product = d1 * d2 * d3;
        } else { // 4-digit
            int d1 = num / 1000;
            int d2 = (num / 100) % 10;
            int d3 = (num / 10) % 10;
            int d4 = num % 10;
            sum = d1 + d2 + d3 + d4;
            product = d1 * d2 * d3 * d4;
        }

        if (sum > product) {
            System.out.println("Yes! The sum of digits is greater than the product of digits.");
        } else if (sum < product) {
            System.out.println("No! The product of digits is greater than the sum of digits.");
        } else {
            System.out.println("Both sum and product are equal.");
        }
    }
}
