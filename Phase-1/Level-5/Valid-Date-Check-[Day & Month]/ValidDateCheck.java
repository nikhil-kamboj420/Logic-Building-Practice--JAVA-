//* Take day and month and check if it forms a valid calendar date (ignoring leap years).

import java.util.Scanner;

public class ValidDateCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day : ");
        int day = sc.nextInt();
        System.out.print("Enter the month : ");
        int month = sc.nextInt();
        sc.close();
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("Please enter a valid day or month.");
            return;
        }
        if (day <= 28 && month == 2) {
            System.out.println("It forms a valid calendar date.");
        } else if ((day <= 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("It forms a valid calendar date.");
        } else if ((day <= 31)
                && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            System.out.println("It forms a valid calendar date.");
        } else {
            System.out.println("It  do not forms a valid calendar date.");
        }
    }
}