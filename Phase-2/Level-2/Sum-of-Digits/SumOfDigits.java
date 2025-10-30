// * Find the sum of digits of a number.

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        // example 234
        while (num > 0) {
            int digit = num % 10; // 4, 3, 2
            sum += digit; // sum = 0 + 4 = 4 , 4 + 3 = 7
            num /= 10; // num = 23 , 2, 0
        }
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
