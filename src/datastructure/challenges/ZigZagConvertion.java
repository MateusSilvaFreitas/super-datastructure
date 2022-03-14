package datastructure.challenges;

public class ZigZagConvertion {

    /**
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
     * (you may want to display this pattern in a fixed font for better legibility)
     *
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * And then read line by line: "PAHNAPLSIIGYIR"
     *
     * @param s
     * @param numRows
     * @return
     */
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        char[] str = s.toCharArray();
        char[] output = new char[s.length()];

        boolean top = false;
        int topIndex = 0;
        int currRow = numRows;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            output[i] = str[index];
            index += ((top && currRow < numRows) || currRow == 1) ?
                    (topIndex + (numRows - currRow)) : 2 * (currRow - 1);
            top = !top;

            if (index >= s.length()) {
                currRow--;
                top = false;
                index = ++topIndex;
            }
        }
        int[] a = new int[10];
        return String.valueOf(output);
    }
}
