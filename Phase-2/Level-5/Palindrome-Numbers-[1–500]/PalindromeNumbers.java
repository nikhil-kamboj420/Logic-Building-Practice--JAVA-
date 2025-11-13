// * Print all numbers that are palindromes b/w 1—500.

public class PalindromeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            int num = i;
            int reversed = 0;
            int original = num;
            
            while (num > 0) {
                int digit = num % 10;          
                reversed = (reversed * 10) + digit; 
                num = num / 10;                
            }
            
            if (original == reversed) {
                System.out.println(original + " is a palindrome");
            }
        }
    }
}
