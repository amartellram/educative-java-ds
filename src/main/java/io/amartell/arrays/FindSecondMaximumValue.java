package io.amartell.arrays;

/**
 *
 */
public class FindSecondMaximumValue {

  // traverse the whole array and return the second largest element present in the array.
  public static final int findSecondMaximum(int[] arr) {

    int firstMax = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int value : arr) {
      if (value > secondMax) {
        secondMax = value;
      }

      if (value > firstMax) {

        secondMax = firstMax;
        firstMax = value;


      }
    }

    return secondMax;
  }
}
