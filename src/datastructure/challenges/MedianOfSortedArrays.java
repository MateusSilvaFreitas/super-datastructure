package datastructure.challenges;

public class MedianOfSortedArrays {
    /**
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int counterList1 = nums1.length - 1;
        int counterList2 = nums2.length - 1;
        int counterMerged = mergedArray.length - 1;

        while (counterList1 >= 0 && counterList2 >= 0) {
            if (nums1[counterList1] > nums2[counterList2]) {
                mergedArray[counterMerged] = nums1[counterList1];
                counterList1--;
                counterMerged--;
            } else {
                mergedArray[counterMerged] = nums2[counterList2];
                counterList2--;
                counterMerged--;
            }
        }

        if (counterList1 >= 0) {
            for (int i = counterMerged; i >= 0; i--) {
                mergedArray[counterMerged] = nums1[counterList1];
                counterList1--;
                counterMerged--;
            }
        } else if (counterList2 > 0) {
            for (int i = counterMerged; i >= 0; i--) {
                mergedArray[counterMerged] = nums2[counterList2];
                counterList2--;
                counterMerged--;
            }
        }
        if (mergedArray.length % 2 == 1) {
            return mergedArray[mergedArray.length / 2];
        }
        return ((mergedArray[(mergedArray.length / 2)] + mergedArray[(mergedArray.length / 2) - 1]) / 2d);

    }
}
