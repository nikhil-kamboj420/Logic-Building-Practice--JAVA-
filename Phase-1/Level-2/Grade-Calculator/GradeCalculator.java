
//*  Take marks (0–100) and print the corresponding grade (A/B/C/D/F). 
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();
        if (marks >= 0 && marks <= 100) {
            if (marks >= 80) {
                System.out.println("Grade: A");
            } else if (marks >= 70) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else if (marks >= 50) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        } else {
            System.out.println("Invalid Marks! Please enter between 0–100.");
        }

        sc.close();
    }
}
