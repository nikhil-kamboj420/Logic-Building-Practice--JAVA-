// * Print the cubes of numbers from 1 to n.

import java.util.Scanner;

public class  CubesOfNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n ; i++){
           System.out.println("Cube of " + i + " = " + (i*i*i));

        }
        sc.close();
    }
}
