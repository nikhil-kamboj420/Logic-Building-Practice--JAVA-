// *  Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good 
//*  Evening”, or “Good Night”.

import java.util.Scanner;

public class GreetByTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour number (0–23): ");
        int hourNum = sc.nextInt();
        sc.close();

        if (hourNum >= 0 && hourNum <= 23) {
            if (hourNum >= 5 && hourNum < 12) {
                System.out.println("Good Morning");
            } else if (hourNum >= 12 && hourNum < 17) {
                System.out.println("Good Afternoon");
            } else if (hourNum >= 17 && hourNum < 21) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Good Night");
            }
        } else {
            System.out.println("Please enter a valid hour (0–23)");
        }
    }
}

