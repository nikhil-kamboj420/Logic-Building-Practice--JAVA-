
// * Print sum of first n terms of Fibonacci series.
import java.util.Scanner;

public class SumOfFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int a = 0, b = 1, sum = 0;

        if (n == 1) {
            System.out.println("Sum of first " + n + " Fibonacci term = " + a);
            return;
        }

        sum = a + b;

        for (int i = 3; i <= n; i++) {
            int Fn = a + b;
            sum += Fn;
            a = b;
            b = Fn;
        }

        System.out.println("Sum of first " + n + " Fibonacci terms = " + sum);
    }
}
