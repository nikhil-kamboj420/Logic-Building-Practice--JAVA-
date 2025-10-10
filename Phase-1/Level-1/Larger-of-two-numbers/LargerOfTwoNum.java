
// * Take two numbers and print the larger one. 
import java.util.Scanner;

public class LargerOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your number 2: ");
        int num2 = sc.nextInt();

        checkLargerOfTwoNum(num1, num2);
        sc.close();
    }

    static void checkLargerOfTwoNum(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Number 1: " + num1 + " is larger");
        } else if (num2 > num1) {
            System.out.println("Number 2: " + num2 + " is larger");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
