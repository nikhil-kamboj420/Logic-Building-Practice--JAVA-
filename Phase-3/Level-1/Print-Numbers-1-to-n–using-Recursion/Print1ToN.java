// * Print numbers from 1 to n using recursion.

public class Print1ToN {
    static void print(int n, int i) {
        if (i > n) return;       
        System.out.print(i + " ");
        print(n, i + 1);        
    }

    public static void main(String[] args) {
        int n = 10;
        print(n, 1);
    }
}
