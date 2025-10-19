//* Take a weekday number (1—7) and determine if it is a weekday or weekend.

import java.util.Scanner;

public class WeekdayOrWeekendCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a weekday number (1-7) : ");
        int weekday = sc.nextInt();
        sc.close();

        if (weekday < 1 || weekday > 7) {
            System.out.println("Please Enter a valid weekday number (1-7)");
            return;
        }

        if (weekday >= 1 && weekday <= 5) {
            System.out.println("This is weekday.");
        } else {
            System.out.println("This is weekend.");
        }
    }
}