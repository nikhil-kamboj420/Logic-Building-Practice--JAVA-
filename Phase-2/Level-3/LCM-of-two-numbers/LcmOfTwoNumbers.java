// * Find LCM of two numbers using loops.

import java.util.Scanner;

public class LcmOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        sc.close();

        if (a <= 0 || b <= 0) {
            System.out.println("Please enter positive numbers only.");
            return;
        }

        int lcm = (a > b) ? a : b;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
                break;
            }
            lcm++;
        }
    }
}
