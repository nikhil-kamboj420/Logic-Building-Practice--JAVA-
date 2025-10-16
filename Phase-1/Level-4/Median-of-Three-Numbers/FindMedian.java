
// * Take three numbers and print the median value (neither maximum nor minimum).
import java.util.Scanner;

public class FindMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();
        sc.close();

        int median;

        if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
            median = num1;
        } else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
            median = num2;
        } else {
            median = num3;
        }

        System.out.println("Median value is: " + median);
    }
}
