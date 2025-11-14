// * Print all numbers from 1—n whose binary representation has an even number of 1s.

import java.util.Scanner;
public class BinaryOnesEvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            if (Integer.bitCount(i) % 2 == 0) System.out.print(i + " ");
        }
    }
}

