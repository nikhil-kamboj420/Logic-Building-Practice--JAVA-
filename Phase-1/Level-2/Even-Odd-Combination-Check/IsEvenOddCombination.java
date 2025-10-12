//*Take two numbers and determine whether both are even, both are odd, or one is  even and one is odd. 

import java.util.Scanner;

public class IsEvenOddCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = sc.nextInt();
        sc.close();

        if (num1 % 2 == 0) {
            if (num2 % 2 == 0) {
                System.out.println("Both numbers are Even.");
            } else {
                System.out.println("One number is Even and one is Odd.");
            }
        } else {
            if (num2 % 2 != 0) {
                System.out.println("Both numbers are Odd.");
            } else {
                System.out.println("One number is Even and one is Odd.");
            }
        }
    }
}
