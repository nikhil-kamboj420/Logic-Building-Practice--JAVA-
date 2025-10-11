// * Check voting eligibility for a given age (18+). 

import java.util.Scanner;

public class IsEligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.close();

        if (age > 0 && age <= 120) {
            if (age >= 18) {
                System.out.println("You are eligible to vote!");
            } else {
                System.out.println("You are not eligible to vote!");
            }
        } else {
            System.out.println("Please enter a valid age (1-120).");
        }
    }
}
