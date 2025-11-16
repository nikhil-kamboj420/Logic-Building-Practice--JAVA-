// * Print numbers from n down to 1 using recursion.

public class PrintNTo1 {
    static void print(int n) {
        if (n == 0) return;   
        System.out.print(n + " ");
        print(n - 1);            
    }

    public static void main(String[] args) {
        print(10);
    }
}
