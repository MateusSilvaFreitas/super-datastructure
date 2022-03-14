package datastructure.challenges;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int a = 0;
        int b = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while (b < s.length()) {
            if (set.add(s.charAt(b))) {
                b++;
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(a));
                a++;
            }
        }
        return max;
    }
}
