
// * Take a number and print wheather it's a positive , negative  or zero.
import java.util.Scanner;

public class TestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt(); 
        checkNumber(num);
        sc.close();
    }

    static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
