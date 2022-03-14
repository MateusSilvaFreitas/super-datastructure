package datastructure.challenges;

public class MyAtoi {
    /**
     * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
     *
     * The algorithm for myAtoi(string s) is as follows:
     *
     * Read in and ignore any leading whitespace.
     * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
     * Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
     * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
     * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
     * Return the integer as the final result.
     * @param s
     * @return
     */
    public static int myAtoi(String s) {
        char[] str = s.toCharArray();
        boolean parseable;
        int res = 0;
        boolean negative = false;
        for (int i = 0; i < s.length(); i++) {
            try {
                if (str[i] == '-') {
                    Integer.parseInt(String.valueOf(str[i + 1]));
                    negative = true;
                }
                Integer.parseInt(String.valueOf(str[i]));
                parseable = true;
            } catch (Exception e) {
                parseable = false;
            }
            if (parseable) {
                int pop = res % 10;
                if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
                if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
                res = res * 10 + Integer.parseInt(String.valueOf(str[i]));
            }
        }

        return negative ? res * -1 : res;
    }
}
