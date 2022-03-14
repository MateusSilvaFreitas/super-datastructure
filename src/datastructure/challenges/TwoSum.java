package datastructure.challenges;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //    public static int[] twoSum(int[] nums, int target) {
//        int[] numbersReturn = new int[2];
//        for(int i = 0; i < nums.length - 1; i++){
//            for(int j = 0; j < nums.length - 1; j++){
//                if(i == j){
//                    continue;
//                }
//                int number = nums[i] + nums[j];
//                if(number == target){
//                    numbersReturn[1] = i;
//                    numbersReturn[0] = j;
//                    break;
//                }
//            }
//        }
//        return numbersReturn;
//    }

    /**
     * Return a new array with the numbers of target sum
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (store.get(nums[i]) == null) {
                store.put(remainder, i);
            } else {
                return new int[]{store.get(nums[i]), i};
            }
        }
        return new int[]{};
    }
}
