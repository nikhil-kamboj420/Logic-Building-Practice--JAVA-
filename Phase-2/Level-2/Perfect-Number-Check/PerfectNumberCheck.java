// * Check if a number is a perfect number

import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int sumOfDivisors = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors == num)
            System.out.println(num + " is a perfect number.");
        else
            System.out.println(num + " is not a perfect number.");
    }
}
