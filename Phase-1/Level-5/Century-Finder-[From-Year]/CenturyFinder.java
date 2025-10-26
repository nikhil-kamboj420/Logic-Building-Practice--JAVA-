//*  Take a year and print the corresponding century (e.g., "19th century", "20th century")

import java.util.Scanner;

public class CenturyFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.close();

        if (year <= 0) {
            System.out.println("Please enter a valid positive year.");
            return;
        }

        int century = (year - 1) / 100 + 1;

        System.out.println(year + " belongs to the " + century + getSuffix(century) + " century.");
    }

    // Helper method to add 'st', 'nd', 'rd', or 'th'
    private static String getSuffix(int century) {
        if (century % 10 == 1 && century % 100 != 11) return "st";
        else if (century % 10 == 2 && century % 100 != 12) return "nd";
        else if (century % 10 == 3 && century % 100 != 13) return "rd";
        else return "th";
    }
}
