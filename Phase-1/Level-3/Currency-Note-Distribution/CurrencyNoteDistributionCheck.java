//* Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.

import java.util.Scanner;

public class CurrencyNoteDistributionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any amount: ");
        int amount = sc.nextInt();
        sc.close();

        if (amount % 2000 == 0) {
            System.out.println("This amount can be evenly divided into 2000 currency notes.");
        } else if (amount % 500 == 0) {
            System.out.println("This amount can be evenly divided into 500 currency notes.");
        } else if (amount % 100 == 0) {
            System.out.println("This amount can be evenly divided into 100 currency notes.");
        } else {
            System.out.println("This amount cannot be evenly divided into 2000, 500, or 100 currency notes.");
        }
    }
}
