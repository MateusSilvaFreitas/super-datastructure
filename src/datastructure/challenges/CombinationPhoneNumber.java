package datastructure.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class CombinationPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Stack<String> stack = new Stack<>();
        Map<Integer, String[]> mapCombinations = new HashMap<>();
        createCombinations(mapCombinations);
        for(int i = 0; i < digits.length(); i++){

        }
        return new ArrayList<>();
    }
    public static void createCombinations(Map<Integer, String[]> mapCombinations){
        mapCombinations.put(2, new String[]{"a", "b", "c"});
        mapCombinations.put(3, new String[]{"d", "e", "f"});
        mapCombinations.put(4, new String[]{"g", "h", "i"});
        mapCombinations.put(5, new String[]{"j", "k", "l"});
        mapCombinations.put(6, new String[]{"m", "n", "o"});
        mapCombinations.put(7, new String[]{"p", "q", "r", "s"});
        mapCombinations.put(8, new String[]{"t", "u", "v"});
        mapCombinations.put(9, new String[]{"w", "x", "y", "z"});
    }
}
