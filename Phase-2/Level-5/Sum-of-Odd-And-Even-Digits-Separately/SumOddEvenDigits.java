// * Print the sum of all odd digits and even digits separately in a number.

import java.util.Scanner;
public class SumOddEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt()); sc.close();
        int evenSum = 0, oddSum = 0;
        if (n == 0) evenSum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0) evenSum += d; else oddSum += d;
            n /= 10;
        }
        System.out.println("Even digit sum = " + evenSum + ", Odd digit sum = " + oddSum);
    }
}

