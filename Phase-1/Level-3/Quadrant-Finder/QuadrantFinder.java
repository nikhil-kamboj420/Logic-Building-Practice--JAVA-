//* Take coordinates (x, y) and determine which quadrant the point lies in. */

import java.util.Scanner;

public class QuadrantFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate value: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate value: ");
        int y = sc.nextInt();
        sc.close();

        if (x > 0 && y > 0) {
            System.out.println("The point lies in First Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("The point lies in Second Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("The point lies in Third Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("The point lies in Fourth Quadrant");
        } else {
            System.out.println("The point lies on the X or Y axis");
        }
    }
}
