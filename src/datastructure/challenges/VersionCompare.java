package datastructure.challenges;

public class VersionCompare {
    public static int compareVersion(String version1, String version2) {
        if (version1.equals(version2)) {
            return 0;
        }
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        int max = Math.max(arr1.length, arr2.length);
        for (int i = 0; i < max; i++) {
            int number1 = arr1.length < i ? 0 : Integer.parseInt(arr1[i]);
            int number2 = arr2.length < i ? 0 : Integer.parseInt(arr2[i]);
            if (number1 > number2) {
                return 1;
            } else if (number2 > number1) {
                return -1;
            }
        }
        return 0;
    }
}
