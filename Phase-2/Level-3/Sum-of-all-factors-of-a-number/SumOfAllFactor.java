// * Find the sum of all factors of a number.

import java.util.Scanner;

public class SumOfAllFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of all factors of " + n + " is: " + sum);
    }
}
