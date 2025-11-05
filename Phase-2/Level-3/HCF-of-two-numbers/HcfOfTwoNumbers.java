// * Find HCF (GCD) of two numbers using loops.

import java.util.Scanner;

public class HcfOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number a: ");
        int a = sc.nextInt();
        System.out.print("Enter  number b: ");
        int b = sc.nextInt();
        int hcf = 0;
        int min = (a < b) ? a : b;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF (GCD) of " + a + " and " + b + " is: " + hcf);
        sc.close();
    }
}
