package io.amartell.arrays;

public class MergeTwoSortedArrays {

  public static int[] mergeArrays(int[] arr1, int[] arr2) {
    //define index for iterate arrays
    int i = 0, j = 0, k = 0, length = arr1.length + arr2.length;
    int[] merged = new int[length];

    //iterate
    while (i < arr1.length && j < arr1.length) {
      if(arr1[i]< arr2[j]) {

        merged[k++] = arr1[i++];
      } else {
        merged[k++] = arr2[j++];
      }
    }

    while(j < arr2.length) {
      merged[k++] = arr2[j++];
    }
    return merged;

  }

}
