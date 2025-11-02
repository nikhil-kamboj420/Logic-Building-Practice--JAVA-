// * Print Fibonacci series up to n terms.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int a = 0, b = 1;

        if (n == 1) {
            System.out.println(a);
            return;
        }

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int Fn = a + b;
            System.out.print(Fn + " ");
            a = b;
            b = Fn;
        }
    }
}
