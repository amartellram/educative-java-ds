package io.amartell.arrays;

public class FindMinimumValue {

  public static int findMinimum(int[] arr) {

    int min = Integer.MAX_VALUE;

    for(int value: arr) {
      if (value < min) min = value;
    }

    return min;
  }
}
