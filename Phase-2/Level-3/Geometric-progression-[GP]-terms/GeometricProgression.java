// * Print first n terms of a Geometric Progression (a, r)

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter common ratio (r): ");
        double r = sc.nextDouble();
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();
        sc.close();

        System.out.print("Geometric Progression: ");
        double term = a;

        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term *= r;
        }
    }
}
