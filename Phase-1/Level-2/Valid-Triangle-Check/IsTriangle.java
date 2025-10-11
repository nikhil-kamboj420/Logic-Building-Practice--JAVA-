// * Take three sides and check if they form a valid triangle. 

import java.util.Scanner;

public class IsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of Triangle: ");
        int side1 = sc.nextInt();
        System.out.print("Enter side 2 of Triangle: ");
        int side2 = sc.nextInt();
        System.out.print("Enter side 3 of Triangle: ");
        int side3 = sc.nextInt();

        checkValidTriangle(side1, side2, side3);
        sc.close();
    }

    static void checkValidTriangle(int a, int b, int c) {
        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {
                    System.out.println("These sides form a valid triangle.");
                } else {
                    System.out.println("Not a valid triangle.");
                }
            } else {
                System.out.println("Not a valid triangle.");
            }
        } else {
            System.out.println(" Not a valid triangle.");
        }
    }
}
