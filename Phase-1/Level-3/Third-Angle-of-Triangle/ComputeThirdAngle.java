//* Take two angles of a triangle and compute the third angle.

import java.util.Scanner;

public class ComputeThirdAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of angle 1: ");
        int angle1 = sc.nextInt();
        System.out.print("Enter the value of angle 2: ");
        int angle2 = sc.nextInt();
        sc.close();

        int angle3 = 180 - (angle1 + angle2);

        if (angle3 > 0) {
            System.out.println("The value of angle 3 is: " + angle3 + "°");
        } else {
            System.out.println("Invalid input! The sum of the two angles cannot be 180° or more.");
        }
    }
}
