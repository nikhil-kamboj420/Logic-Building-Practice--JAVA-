// * Take 5 numbers as input. If the user enters 0, skip it using continue. At the end, print the sum of all non-zero numbers entered.

import java.util.Scanner;
public class SumNonZeroInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int m = sc.nextInt();
        int sum = 0;
        System.out.println("Enter " + m + " numbers:");
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (x == 0) continue; 
            sum += x;
        }
        sc.close();
        System.out.println("Sum of non-zero inputs = " + sum);
    }
}

