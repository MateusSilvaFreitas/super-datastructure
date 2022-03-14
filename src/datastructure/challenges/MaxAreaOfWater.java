package datastructure.challenges;

public class MaxAreaOfWater {
    public static int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // WORKS TOO, BUT THE COMPLEXITY IS O(N²)
        // for(int i = 0; i < arrLength; i++){
        //     for(int j = i + 1; j < arrLength; j++){
        //         int totalArea = 0;
        //         if(height[i] - height[j] >= 0){
        //             totalArea = height[j] * (j - i);
        //             maxArea = totalArea > maxArea ? totalArea : maxArea;
        //         } else {
        //             totalArea = height[i] * (j - i);
        //             maxArea = totalArea > maxArea ? totalArea : maxArea;
        //         }
        //     }
        // }
        return maxArea;
    }
}
