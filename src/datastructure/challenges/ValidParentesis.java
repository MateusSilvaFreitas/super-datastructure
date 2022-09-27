package datastructure.challenges;

import java.util.Stack;

public class ValidParentesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                st.push(s.charAt(i));
            else if (!st.isEmpty()) {
                char x = st.pop();
                if (x == '(' && s.charAt(i) != ')')
                    return false;
                if (x == '[' && s.charAt(i) != ']')
                    return false;
                if (x == '{' && s.charAt(i) != '}')
                    return false;
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }
}
