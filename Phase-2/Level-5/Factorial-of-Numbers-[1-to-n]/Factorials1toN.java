// * Print factorial of each number from 1 to n.

import java.util.Scanner;
public class Factorials1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.close();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println(i + "! = " + fact);
        }
    }
}
