// * Print the reverse of a given number.

import java.util.Scanner;

public interface ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("The reverse of the number is: ");
        for (int i = num; i > 0; i /= 10) {
            int digit = i % 10;
            System.out.print(digit);
        }
        sc.close();
    }
}
