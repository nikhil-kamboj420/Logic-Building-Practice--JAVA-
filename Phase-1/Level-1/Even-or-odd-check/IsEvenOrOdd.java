
// * Check if a number is even or odd.
import java.util.Scanner;

public class IsEvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        checkEvenOrOdd(num);
        sc.close();
    }

    static void checkEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
