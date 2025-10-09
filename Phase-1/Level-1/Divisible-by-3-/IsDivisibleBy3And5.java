//* Check if a number is divisible by both 3 and 5.

import java.util.Scanner;

public class IsDivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        checkDivisibleBy3And5(num);
        sc.close();
    }

    static void checkDivisibleBy3And5(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Yes! " + num + " is divisible by both 3 and 5");
        } else {
            System.out.println("No! " + num + " is not divisible by both 3 and 5");
        }
    }
}
