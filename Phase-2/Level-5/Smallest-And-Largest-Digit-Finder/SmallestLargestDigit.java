// * Find the smallest and largest digit in a given number.

import java.util.Scanner;
public class SmallestLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int num = Math.abs(n);
        if (num == 0) {
            System.out.println("Min = 0, Max = 0");
            return;
        }

        int min = 9, max = 0;
        while (num > 0) {
            int d = num % 10;
            if (d < min) min = d;
            if (d > max) max = d;
            num /= 10;
        }
        System.out.println("Min digit = " + min + ", Max digit = " + max);
    }
}

