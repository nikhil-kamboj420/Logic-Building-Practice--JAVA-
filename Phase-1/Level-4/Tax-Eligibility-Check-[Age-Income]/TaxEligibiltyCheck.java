// * Take income and age, and check if eligible for tax (age > 18 and income > 5 L).

import java.util.Scanner;

public class TaxEligibiltyCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter you income : ");
        int income = sc.nextInt();
        sc.close();

        if ((age < 0 || age >= 120) || (income < 0)) {
            System.out.println("Please enter a valid age or income.");
            return;
        }

        if (age > 18 && income > 500000) {
            System.out.println("You are Eligible for Tax.");
        } else {
            System.out.println("You are not Eligible for Tax.");
        }
    }
}
