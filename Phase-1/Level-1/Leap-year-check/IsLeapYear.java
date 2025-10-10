// * Check if a given year is a leap year. 

import java.util.Scanner;

public class IsLeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Year: ");
        int year = sc.nextInt();

        checkLeapYear(year);
        sc.close();
    }

    static void checkLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Yes! " + year + " is a Leap Year");
        } else {
            System.out.println("No! " + year + " is not a Leap Year");
        }
    }
}
