package io.amartell.arrays;

public class FindMax {

    public static int findMaxSumSubArray(int[] arr) {

        int max = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {

            int sum = arr[i];
            int maxSum = sum;
            for (int j = i + 1; j < arr.length; j++) {

                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
            max = Math.max(max, maxSum);
        }
        return max;
    }

    public static int findMaxSumSubArrayDP(int[] arr) {
        if (arr.length < 1) {
            return 0;
        }

        int currMax = arr[0];
        int globalMax = arr[0];
        int lengthArray = arr.length;
        for (int i = 1; i < lengthArray; i++) {
            if (currMax < 0) {
                currMax = arr[i];
            } else {
                currMax += arr[i];
            }

            if (globalMax < currMax) {
                globalMax = currMax;
            }

        }
        return globalMax;
    }
}
