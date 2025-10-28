// * Count the number of digits in a given number.

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp /= 10; // remove last digit
                count++;
            }
        }

        System.out.println("The number of digits in " + num + " is: " + count);
        sc.close();
    }
}
