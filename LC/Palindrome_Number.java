// N time 1 space

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        // negative numbers are not palindromes here
        // other numbers ending with 0 are not palindromes either
        if (x == 0) return true;
        if (x < 0) return false;

        int number = x;
        long temp = 0;
        while (x != 0) {
            temp = temp * 10 + x % 10;
            x /= 10;
            if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE)
                return false;
        }
        return (int) temp == number;
    }
}