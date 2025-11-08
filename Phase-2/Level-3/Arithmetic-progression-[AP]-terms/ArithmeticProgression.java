// * Print first n terms of an Arithmetic Progression (a, d)

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();
        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();
        sc.close();

        System.out.print("Arithmetic Progression: ");
        for (int i = 1; i <= n; i++) {
            int term = a + (i - 1) * d;
            System.out.print(term + " ");
        }
    }
}
