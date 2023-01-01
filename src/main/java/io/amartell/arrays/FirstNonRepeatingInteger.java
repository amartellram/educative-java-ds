package io.amartell.arrays;

import java.util.Arrays;

public class FirstNonRepeatingInteger {

  public static int findFirstUnique(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      boolean unique = true;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j] || arr[j] == arr[j - 1]) {
          unique = false;
          break;
        }
      }
      if (unique) {
        return arr[i];
      }
    }

    return -1;
  }
}
