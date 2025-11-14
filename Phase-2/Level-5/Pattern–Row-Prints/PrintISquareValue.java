//* Print a pattern where each row i prints i*i.

import java.util.Scanner;
public class PrintISquareValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.close();
        for (int i = 1; i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
