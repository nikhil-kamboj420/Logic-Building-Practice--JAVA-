//* Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.

import java.util.Scanner;

public class PointPositionCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x coordinate : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y coordinate : ");
        int y = sc.nextInt();
        if (x == 0 && y == 0)
        System.out.println("Point lies at the origin");
        else if (x == 0)
        System.out.println("Point lies on the Y-axis");
        else if (y == 0)
        System.out.println("Point lies on the X-axis");
        else
        System.out.println("Point lies in a quadrant");

        sc.close();
    }
}