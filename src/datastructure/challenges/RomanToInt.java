package datastructure.challenges;

import java.util.Map;

public class RomanToInt {

    //    public static int romanToInt(String s) {
//        int value = 0;
//        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
//        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//        int strCounter = 0;
//        for(int i = 0; i < values.length; i++){
//            if(strCounter <= s.length() && strCounter + romanLiterals[i].length() <= s.length()){
//                String a = s.substring(strCounter, strCounter + romanLiterals[i].length());
//                boolean stopLoop = false;
//                while(a.equals(romanLiterals[i]) && !stopLoop){
//                    value += values[i];
//                    strCounter += romanLiterals[i].length();
//                    if(strCounter <= s.length() && strCounter + romanLiterals[i].length() <= s.length()){
//                        a = s.substring(strCounter, strCounter + romanLiterals[i].length());
//                    } else {
//                        stopLoop = true;
//                    }
//                }
//            }
//        }
//        return value;
//    }

    /**
     * Transform a roman in integer
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        // Time: O(n)
        // Space: O(1) -- map is constant space
        // Beats 84.91% of Java online submissions

        // Init map to retrieve int vals for roman numerals in O(1) time
        Map<Character, Integer> m = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int result = 0;
        int i = s.length() - 1;

        // Work backwards to simplify logic
        while (i >= 0) {

            // Add the current roman numeral
            result += m.get(s.charAt(i));

            // Check if we need to subtract the value to the left
            // We can do this by checking if it is less than current value
            if (i > 0 && m.get(s.charAt(i - 1)) < m.get(s.charAt(i))) {
                result -= m.get(s.charAt(i - 1));

                // Dont forget to subtract i because we read two letters
                i--;
            }

            i--;
        }

        return result;
    }


}
