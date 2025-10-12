
// * Take a month number (1–12) and print the number of days in that month (ignore leap  years). 
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month Number (1-12) : ");
        int monthNum = sc.nextInt();
        sc.close();

        if (monthNum >= 1 && monthNum <= 12) {
            if (monthNum == 1) {
                System.out.println("31 days");
            } else if (monthNum == 2) {
                System.out.println("28 days");
            } else if (monthNum == 3) {
                System.out.println("31 days");
            } else if (monthNum == 4) {
                System.out.println("30 days");
            } else if (monthNum == 5) {
                System.out.println("31 days");
            } else if (monthNum == 6) {
                System.out.println("30 days");
            } else if (monthNum == 7) {
                System.out.println("31 days");
            } else if (monthNum == 8) {
                System.out.println("31 days");
            } else if (monthNum == 9) {
                System.out.println("30 days");
            } else if (monthNum == 10) {
                System.out.println("31 days");
            } else if (monthNum == 11) {
                System.out.println("30 days");
            } else {
                System.out.println("31 days");
            }
        } else {
            System.out.println("Enter a valid  month  Number (1-12)");
        }
    }
}
