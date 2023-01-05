package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RearrangeSortedArrayTest {

  private static Stream<Arguments> inputAndOutput() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{5, 1, 4, 2, 3}),
        Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{5, 1, 4, 2, 3})
    );
  }

  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void maxMin(int[] input, int[] output) {
    RearrangeSortedArray.maxMin(input);
    assertArrayEquals(output, input);
  }
}