//* Take three numbers and check if they can form a Pythagorean triplet.

import java.util.Scanner;

public class PythagoreanTripletCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();
        sc.close();

        if ((num1 * num1 + num2 * num2 == num3 * num3) ||
            (num2 * num2 + num3 * num3 == num1 * num1) ||
            (num1 * num1 + num3 * num3 == num2 * num2)) {

            System.out.println("Yes, it can form a Pythagorean triplet.");
        } else {
            System.out.println("No, it cannot form a Pythagorean triplet.");
        }
    }
}
