//*  Take a day number (1–7) and print the corresponding day name.
import java.util.Scanner;

public class DayNameFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day Number (1-7) : ");
        int dayNum = sc.nextInt();
        sc.close();

        if (dayNum >= 1 && dayNum <= 7) {
            if (dayNum == 1) {
                System.out.println("Monday");
            } else if (dayNum == 2) {
                System.out.println("Tuesday");
            } else if (dayNum == 3) {
                System.out.println("Wednesday");
            } else if (dayNum == 4) {
                System.out.println("Thursday");
            } else if (dayNum == 5) {
                System.out.println("Friday");
            } else if (dayNum == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Enter a valid day Number (1-7)");
        }
    }
}
