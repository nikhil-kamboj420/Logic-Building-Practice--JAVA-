//* Check whether a number is a perfect square (without using the square root function).
import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        boolean isPerfectSquare = false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare)
            System.out.println(num + " is a perfect square.");
        else
            System.out.println(num + " is not a perfect square.");
    }
}

