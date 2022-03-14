package datastructure.challenges;

public class LongestPalindrome {

    static int lo, maxLen, half, len;

    /**
     * Given a string s, return the longest palindromic substring in s.
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        len = s.length();
        if (len < 2) {
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            //for odd length string(s)
            extendPalindrome(s, i, i);
            //for even length string(s)
            extendPalindrome(s, i, i + 1);
        }

        return s.substring(lo, lo + maxLen);
    }


    private static void extendPalindrome(String s, int left, int right) {
        if (left - half < 0 || right + half >= len || s.charAt(left - half) != s.charAt(right + half)) {
            return;
        }

        //Expand both left and right till char at left and right are equal.
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        //If maxLen is less than previous length of palindromic substring, then update lo, maxLen and half.
        if (maxLen < right - left - 1) {
            lo = left + 1;
            maxLen = right - left - 1;
            half = maxLen / 2;
        }
    }
}
