// * Take two numbers and check if both are positive and their sum is less than 100.

import java.util.Scanner;

public class PositiveSumLess100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        sc.close();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Only positive numbers are allowed. ");
            return;
        }
        int sum = num1 + num2;
        if (sum < 100) {
            System.out.println("Both numbers are positive, and their sum is less than 100.");
        } else {
            System.out.println("Both numbers are positive, but their sum is greater than or equal to 100.");
        }

    }
}
