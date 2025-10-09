//* Check if a number is divisible by 5. 

import java.util.Scanner;

public class IsDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        checkDivisibleBy5(num);
        sc.close();
    }

    static void checkDivisibleBy5(int num) {
        if (num % 5 == 0) {
            System.out.println("Yes! " + num + " is divisible by 5");
        } else {
            System.out.println("No! " + num + " is not divisible by 5");
        }
    }
}
