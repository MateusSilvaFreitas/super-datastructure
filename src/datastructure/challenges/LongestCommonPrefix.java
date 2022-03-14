package datastructure.challenges;

public class LongestCommonPrefix {
    /**
     * The longest common prefix of string word
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if(strs[0].length() < 1)return "";

        String commonPrefix = strs[0].substring(0,1);
        int counterPrefix = 1, counterStrs = 0;
        boolean stopLoop = false;
        while(!stopLoop){
            String prefix = strs[counterStrs].substring(0, counterPrefix);
            if(commonPrefix.equals(prefix)){
                counterStrs++;
            } else {
                return strs[counterStrs].substring(0, counterPrefix - 1);
            }

            if(counterStrs > strs.length - 1){
                counterStrs = 0;
                counterPrefix++;
                if(counterPrefix > strs[counterStrs].length()){
                    return commonPrefix;
                }
                commonPrefix = strs[counterStrs].substring(0, counterPrefix);
            }

            if(counterPrefix > strs[counterStrs].length()){
                stopLoop = true;
                commonPrefix = strs[counterStrs].substring(0, counterPrefix - 1);
            }
        }

        return commonPrefix;
    }

}
