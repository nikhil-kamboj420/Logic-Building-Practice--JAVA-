// * Check if a number is prime or not.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if (num <= 1) {  // handle invalid or non-prime cases
            System.out.println(num + " is not a Prime number.");
            return;
        }

        boolean isPrime = true;

        // check divisibility from 2 up to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }
    }
}
