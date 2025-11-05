// * Print all numbers bewveen a and b divisible by 7.

import java.util.Scanner;

public class NumbersDivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number a: ");
        int a = sc.nextInt();
        System.out.print("Enter  number b: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 7 == 0) {
                System.out.print(i + ",");
            }
        }
        sc.close();
    }
}
