// * Take time (hours and minutes) and print the smaller angle between the hour and minute hands.

import java.util.Scanner;

public class ClockAngle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours number : ");
        int hours = sc.nextInt();
        System.out.print("Enter minutes number : ");
        int minutes = sc.nextInt();
        sc.close();
        if (hours >= 1 && hours <= 12 && minutes >= 0 && minutes <= 59) {
            double hoursAngle = 30 * hours + 0.5 * minutes;
            double minutesAngle = 6 * minutes;
            double angle = Math.abs(hoursAngle - minutesAngle);
            double smallerAngle = Math.min(angle, 360 - angle);
            System.out.println("the smaller angle between the hour and minute hands is -  " + smallerAngle);
        } else {
            System.out.println("Invalid hours or minutes number .");
        }
    }
}