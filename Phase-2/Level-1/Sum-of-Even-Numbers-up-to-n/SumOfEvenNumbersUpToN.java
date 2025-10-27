// * Print the sum of all even numbers up to n.

import java.util.Scanner;

public class SumOfEvenNumbersUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of all even numbers up to " + n + " numbers is " + sum);
        sc.close();
    }
}
