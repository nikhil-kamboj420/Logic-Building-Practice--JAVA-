// * Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’. 

import java.util.Scanner;

public class AlphabetRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character: ");
        char ch = sc.nextLine().toLowerCase().charAt(0);
        sc.close();

        if (ch >= 'a' && ch <= 'z') {
            if (ch >= 'a' && ch <= 'm') {
                System.out.println(ch + " lies between 'a' and 'm'");
            } else {
                System.out.println(ch + " lies between 'n' and 'z'");
            }
        } else {
            System.out.println("Enter a valid Alphabet Character (a - z)");
        }
    }
}
