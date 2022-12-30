package io.amartell.arrays;

/*
 * You have to implement the int[] findProduct(int[] arr) method
 * which will modify arr in such a way that in the output,
 * each index i will contain the product of all elements present in arr
 * except the element stored on that index i.
 */
public class ArrayOfProducts {


  // 1 2 3 4
  // 24, 12, 8, 6
  public static int[] findProduct(int[] arr) {
    int[] productOfValues = new int[arr.length];
    int product = 1;

    // initialize all values with 1
    for (int i = 0; i < arr.length; i++) {
      productOfValues[i] = 1;
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i != j) {
          productOfValues[i] *= arr[j];
        }
      }
    }

    return productOfValues;
  }

  public static int[] findProductLinear(int[] arr) {

    int result[] = new int[arr.length];
    int product = 1;

    // left iteration
    for (int i = 0; i < arr.length; i++) {
      result[i] = product;
      product *= arr[i];
    }

    product = 1;

    //right iteration
    for (int i = arr.length - 1; i >= 0; i--) {
      result[i] *= product;
      product *= arr[i];
    }

    return result;

  }

}
