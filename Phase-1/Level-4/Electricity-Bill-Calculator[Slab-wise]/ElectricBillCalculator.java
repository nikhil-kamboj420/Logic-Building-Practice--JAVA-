//* Take electricity units consumed and calculate the bill as per slabs (using if-else).

import java.util.Scanner;

public class ElectricBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();
        sc.close();

        // validate input
        if (units < 0 || units > 500) {
            System.out.println("Please enter a valid unit number (0-500).");
            return;
        }

        int rate = 0;

        if (units >= 0 && units <= 100) {
            rate = 4;
        } else if (units > 100 && units <= 200) {
            rate = 5;
        } else if (units > 200 && units <= 500) {
            rate = 6;
        }

        int totalBill = units * rate;
        System.out.println("Your electricity bill is: ₹" + totalBill);
    }
}
