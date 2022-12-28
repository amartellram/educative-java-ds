package io.amartell.arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * In this problem, you have to implement the int[] findSum(int[] arr, int n) method,
 * which will take a number n, and an array arr as input and returns an array of two integers
 * that add up to n in an array. You are required to return only one such pair.
 * If no such pair is found then simply return the array.
 */
public class FindTwoNumbers {

  public static int[] findSum(int[] arr, int n) {
    Map<Integer, Integer> differenceMap = new HashMap<>();

    // iterate each element
    for (int i = 0; i < arr.length; i++) {
      int val = arr[i];
      //check if the difference exists in the map
      if (differenceMap.containsKey(n - val)) {
        // return the array
        return new int[]{arr[differenceMap.get(n-val)], val};
      } else {
        // If it does not exist, put the value and the index in the map
        differenceMap.put(val, i);
      }
    }
    return arr;
  }
}
