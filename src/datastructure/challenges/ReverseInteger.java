package datastructure.challenges;

public class ReverseInteger {

    //    public static int reverse(int x) {
//        String str = new StringBuilder(String.valueOf(x)).reverse().toString();
//        boolean negative = false;
//        if(str.endsWith("-")){
//            str = str.substring(0, str.length() - 1);
//        }
//        Double number = Double.parseDouble(str);
//        double max = Math.pow(2, 31) - 1;
//        double min = Math.pow(-2, 31);
//        if(number > max || number < min){
//            return 0;
//        }
//        return negative ? number.intValue() * -1 : number.intValue();
//    }

    /**
     * Given a signed 32-bit integer x, return x with its digits reversed.
     * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
