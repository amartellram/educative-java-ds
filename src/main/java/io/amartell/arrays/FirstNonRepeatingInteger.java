package io.amartell.arrays;

import java.util.Arrays;

public class FirstNonRepeatingInteger {

  public static int findFirstUnique(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      boolean unique = true;
      for (int j = 0; j < arr.length; j++) {
        if (i!= j && arr[i] == arr[j] ) {
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
