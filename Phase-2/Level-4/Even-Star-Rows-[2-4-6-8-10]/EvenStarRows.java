// * Print Stars in Even Numbers (2, 4, 6, 8, 10)

import java.util.Scanner;

public class EvenStarRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
