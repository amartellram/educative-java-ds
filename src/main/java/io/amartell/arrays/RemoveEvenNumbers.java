package io.amartell.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenNumbers {
  private static boolean isEven(int v) {
    return v % 2 == 0;
  }

  public static int[] eliminateWithFor(int[] arr) {
    int newArrayLength = 0;

    for (int v : arr) {
      if (!isEven(v)) {
        newArrayLength++;
      }
    }

    int[] newArray = new int[newArrayLength];

    for (int i = 0, k = 0; i < arr.length && k < newArrayLength; i++) {
      if (!isEven(arr[i])){
        newArray[k] = arr[i];
        k++;
      }
    }

    return newArray;
  }

  public static int[] eliminateWithIterator(int[] arr) {
    List<Integer> list = new ArrayList<Integer>(Arrays.stream(arr).boxed().toList());
    Iterator<Integer> iterator = list.iterator();
    while(iterator.hasNext()){
      int value = iterator.next();
      if(isEven(value)) iterator.remove();
    }
    return list.stream().mapToInt(i-> i).toArray();
  }

  public static int[] eliminateWithStream(int[] arr) {
    List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
    list.removeIf(RemoveEvenNumbers::isEven);
    return list.stream().mapToInt(i -> i).toArray();
  }

}
