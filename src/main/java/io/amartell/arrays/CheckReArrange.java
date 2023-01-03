package io.amartell.arrays;


public class CheckReArrange {

  public static void reArrange(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < 0 && arr[i] > 0) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void reArrangeNew(int[] arr) {
    int n = arr.length;
    int newIndex = 0;
    int[] newArray = new int[n];

    for (int i = 0; i < n; i++) {
      if (arr[i] < 0) {
        newArray[newIndex++] = arr[i];
      }
    }

    for (int i = 0; i < n; i++) {
      if (arr[i] >= 0) {
        newArray[newIndex++] = arr[i];
      }
    }

    for (int i = 0; i < n; i++) {
      arr[i] = newArray[i];
    }
  }

  public static void reArrangeSwap(int[] arr) {
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        if (i != j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
        j++;
      }
    }
  }
}
