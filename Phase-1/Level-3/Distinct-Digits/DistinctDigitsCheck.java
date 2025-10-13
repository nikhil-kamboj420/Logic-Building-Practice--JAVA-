
// * Take a 3-digit number and check if all digits are distinct. 
import java.util.Scanner;

public class DistinctDigitsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        sc.close();

        if (num < 100 || num > 999) {
            System.out.println("Please enter a valid 3-digit number!");
            return;
        }

        int digit1 = num / 100; // hundreds place
        int digit2 = (num / 10) % 10; // tens place
        int digit3 = num % 10; // units place

        if (digit1 != digit2 && digit1 != digit3 && digit2 != digit3) {
            System.out.println("All digits are distinct.");
        } else {
            System.out.println("Digits are not all distinct.");
        }
    }
}
