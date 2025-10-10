
// * Take three numbers and print the largest. 
import java.util.Scanner;

public class LargerOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter your number 3: ");
        int num3 = sc.nextInt();

        checkLargerOfThreeNum(num1, num2, num3);
        sc.close();
    }

    static void checkLargerOfThreeNum(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("Number 1: " + num1 + " is largest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Number 2: " + num2 + " is largest");
        } else {
            System.out.println("Number 3: " + num3 + " is largest");
        }
    }
}
