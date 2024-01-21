import java.util.Arrays;

public class FindingMaxAndMinDifference {
    public static void main(String[] args) {
        int[] arr = {0, 4, 6, 12, 19, 20};
        findMinMaxDiffPairs(arr);
    }
    public static void findMinMaxDiffPairs(int[] arr) {
        int n = arr.length;

        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int minDiff = Integer.MAX_VALUE;
        int[] minPair = new int[2];
        int maxDiff = Integer.MIN_VALUE;
        int[] maxPair = new int[2];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(arr[i] - arr[j]);

                if (diff < minDiff) {
                    minDiff = diff;
                    minPair[0] = arr[i];
                    minPair[1] = arr[j];
                }

                if (diff > maxDiff) {
                    maxDiff = diff;
                    maxPair[0] = arr[i];
                    maxPair[1] = arr[j];
                }
            }
        }
        System.out.println("Pair with minimum difference: " + Arrays.toString(minPair) + ", Difference: " + minDiff);
        System.out.println("Pair with maximum difference: " + Arrays.toString(maxPair) + ", Difference: " + maxDiff);
    }
}
