// * Print the product of digits of a given number.

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;
        int temp = num; 

        while (temp != 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }

        System.out.println("The product of digits of " + num + " is: " + product);
        sc.close();
    }
}
