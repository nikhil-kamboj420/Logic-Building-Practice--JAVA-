// * Print all numbers whose sum of digits is even (1—100).

public class NumbersWithEvenDigitSum {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }

            if (sum % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
