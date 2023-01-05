package io.amartell.arrays;


/**
 * Given an array, can you re-arrange the elements such that the first position will have the
 * largest number, the second will have the smallest, the third will have the second-largest, and so
 * on.
 */
public class RearrangeSortedArray {

  public static void maxMin(int[] arr) {
    int n = arr.length;
    int newIndex = 0;
    int[] newArray = new int[n];
    for (int i = 0, j = n - 1; i <= j; i++, j--) {
      newArray[newIndex++] = arr[j];
      if (newIndex < n) {
        newArray[newIndex++] = arr[i];
      }
    }

    for (int i = 0; i < n; i++) {
      arr[i] = newArray[i];
    }
  }

}
