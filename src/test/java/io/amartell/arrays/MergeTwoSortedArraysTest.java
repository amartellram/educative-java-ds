package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MergeTwoSortedArraysTest {

  private static Stream<Arguments> inputAndOutputs() {
    return Stream.of(
        Arguments.of(new int[]{1, 3, 4, 5}, new int[]{2, 6, 7, 8},
            new int[]{1, 2, 3, 4, 5, 6, 7, 8}),
        Arguments.of(new int[]{1, 3, 3, 4, 4, 5}, new int[]{3, 5, 6, 7, 8},
            new int[]{1, 3, 3, 3, 4, 4, 5, 5, 6, 7, 8})
    );
  }

  @ParameterizedTest
  @MethodSource("inputAndOutputs")
  void mergeArrays(int[] array1, int[] array2, int[] expected) {
    int[] merged = MergeTwoSortedArrays.mergeArrays(array1, array2);
    assertArrayEquals(expected, merged);

  }
}