//* Take 24-hour time (hours and minutes) and print whether it is AM or PM

import java.util.Scanner;

public class AmOrPmTimeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours number (0-23) : ");
        int hours = sc.nextInt();
        System.out.print("Enter minutes number (0-59) : ");
        int minutes = sc.nextInt();
        sc.close();

        if ((hours < 0 || minutes < 0) || (hours > 23 || minutes > 59)) {
            System.out.println("Enter a valid hours  (0-23) or minutes (0-59) number ");
            return;
        }

        if ((hours >= 0 && hours <= 11) && (minutes >= 0 && minutes <= 59)) {
            System.out.println("This is AM");
        } else {
            System.out.println("This is PM");
        }

    }
}