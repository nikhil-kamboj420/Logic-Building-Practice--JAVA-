// * Print HourglassPattern

public class HourglassPattern{
    public static void main(String[] args) {
        int i, j, k, n = 8;

        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(' ');
            }

            for (k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(' ');
            }
            for (k = i; k <= n; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}