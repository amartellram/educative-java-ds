package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ArrayOfProductsTest {


  private static Stream<Arguments> inputAndOutput() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}),
        Arguments.of(new int[]{2, 5, 9, 3, 6}, new int[]{810, 324, 180, 540, 270}),
        Arguments.of(new int[]{0, 1, 2}, new int[]{2, 0, 0}),
        Arguments.of(new int[]{11, 2, 5, 7, 2}, new int[]{140, 770, 308, 220, 770})
    );
  }

  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void findProduct(int[] input, int[] output) {
    int[] response = ArrayOfProducts.findProduct(input);
    assertArrayEquals(output, response);
  }
}