//*  Check if one of two given numbers is a multiple of the other.

import java.util.Scanner;

public class IsMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " is multiple of " + num2);
        } else {
            if (num2 % num1 == 0) {
                System.out.println(num2 + " is multiple of " + num1);
            } else {
                System.out.println("No multiple exist!");
            }
        }

        sc.close();
    }
}
