
//* Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions. 
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature number : ");
        int temp = sc.nextInt();
        sc.close();
        checkTemperature(temp);;
    }

    static void checkTemperature(int temp) {
        if (temp <= 20) {
            System.out.println("Temperature is Cold");
        } else if (temp <= 40) {
            System.out.println("Temperature is Warm");
        } else {
            System.out.println("Temperature is Hot");
        }
    }
}
