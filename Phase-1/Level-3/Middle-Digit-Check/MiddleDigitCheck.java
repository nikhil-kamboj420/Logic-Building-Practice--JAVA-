// *Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither. 

import java.util.Scanner;

public class MiddleDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        sc.close();
        if (num < 100 || num > 999) {
            System.out.println("Please enter a valid 3-digit number!");
            return;
        }
        int digit1 = num / 100; // hundreds place
        int digit2 = (num / 10) % 10; // tens place
        int digit3 = num % 10; // units place
        if (digit2 > digit1 && digit2 > digit3) {
            System.out.println("' " + digit2 + " ' Middle digit is the Largest");
        } else {
            if (digit2 < digit1 && digit2 < digit3) {
                System.out.println("' " + digit2 + " ' Middle digit is the Smallest");
            } else {
                System.out.println("' " + digit2 + " ' Middle digit is Neither largest nor smallest");
            }
        }
    }
}
