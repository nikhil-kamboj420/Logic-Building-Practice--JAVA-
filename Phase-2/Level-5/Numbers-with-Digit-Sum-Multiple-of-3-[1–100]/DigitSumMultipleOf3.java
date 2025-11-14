// * Print numbers bewveen 1—100 whose digits add up to a multiple of 3.
public class DigitSumMultipleOf3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int n = i, sum = 0;
            while (n > 0) { sum += n % 10; n /= 10; }
            if (sum % 3 == 0) System.out.print(i + " ");
        }
    }
}
