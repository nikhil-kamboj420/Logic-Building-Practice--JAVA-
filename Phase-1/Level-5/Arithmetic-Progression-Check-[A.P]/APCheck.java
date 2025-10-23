// *  Take three numbers and check if they are in arithmetic progression.

import java.util.Scanner;

public class APCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();

        if (num2 * 2 == num1 + num3) {
            System.out.println("They are in arithmetic progression.");
        } else {
            System.out.println("They are not  in arithmetic progression.");
        }
        sc.close();
    }
}