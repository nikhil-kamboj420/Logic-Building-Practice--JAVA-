// * Check if a number is multiple of 7 or ends with 7
import java.util.Scanner;

public class MultipleOrEndsWith7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if (num % 7 == 0) {
            System.out.println("Yes! " + num + " is a multiple of 7");
        } else {
            if (num % 10 == 7) {
                System.out.println("Yes! " + num + " ends with 7");
            } else {
                System.out.println("There is no multiple of 7 or number ending with 7: " + num);
            }
        }
    }
}

