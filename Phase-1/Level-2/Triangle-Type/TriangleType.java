//* If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene. 

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of Triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2 of Triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3 of Triangle: ");
        int c = sc.nextInt();
        sc.close();

        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {
                    if (a == b) {
                        if (b == c) {
                            System.out.println("Equilateral Triangle");
                        } else {
                            System.out.println("Isosceles Triangle");
                        }
                    } else if (b == c || a == c) {
                        System.out.println("Isosceles Triangle");
                    } else {
                        System.out.println("Scalene Triangle");
                    }
                } else {
                    System.out.println("Not a valid triangle");
                }
            } else {
                System.out.println("Not a valid triangle");
            }
        } else {
            System.out.println("Not a valid triangle");
        }
    }
}
