package io.amartell.arrays;

public class FindMax {

  public static int findMaxSumSubArray(int[] arr) {

    int max = Integer.MIN_VALUE;


    for (int i = 0; i < arr.length; i++) {

      int sum = arr[i];
      int maxSum = sum;
      for(int j = i + 1 ; j < arr.length; j++) {

        sum+= arr[j];
        maxSum = Math.max(maxSum, sum);
      }
      max = Math.max(max, maxSum);
    }
    return max;
  }
}
