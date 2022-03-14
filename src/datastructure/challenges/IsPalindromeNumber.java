package datastructure.challenges;

public class IsPalindromeNumber {
    /**
     * Given an integer x, return true if x is palindrome integer.
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int sum = 0;
        while (x > sum) {
            sum = sum * 10 + x % 10;
            x /= 10;
        }
        return (x == sum || x == sum / 10);
    }
}
