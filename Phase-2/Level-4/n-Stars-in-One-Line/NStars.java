// *  Print n Stars on Same Line 

import java.util.Scanner;

public class NStars {
    public static void main(String[] args) {
        System.out.print("enter the number of Stars you want to print : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print('*');
        }
        sc.close();
    }
}
