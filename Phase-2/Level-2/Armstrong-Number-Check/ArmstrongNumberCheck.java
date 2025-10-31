// * Check if a number is an Armstrong number.

import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int originalNum = num;
        int count = 0;
        for (int i = num; i > 0; i /= 10) {
            count++;
        }
        int n = count;
        int sumOfPowers = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfPowers += Math.pow(digit, n);
            num /= 10;
        }
        if (sumOfPowers == originalNum)
            System.out.println(originalNum + " is an Armstrong number.");
        else
            System.out.println(originalNum + " is not an Armstrong number.");

        sc.close();
    }
}
