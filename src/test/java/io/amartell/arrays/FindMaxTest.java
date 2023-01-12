package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindMaxTest {

  private static Stream<Arguments> inputAndOutput() {
    return Stream.of(
        Arguments.of(new int[]{1, 7, -2, -5, 10, -1}, 11),
        Arguments.of(new int[]{5, 1, -4, 2, 3}, 7),
        Arguments.of(new int[]{-2, 10, 7, -5, 15, 6 }, 33),
        Arguments.of(new int[]{-5, -13, -2, -4}, -2),
        Arguments.of(new int[]{1, 10, -1, 11, 5, -30, -7, 20, 25, -35}, 45),
        Arguments.of(new int[]{-7, 6, -2}, 6)
    );
  }

  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void findMaxSumSubArray(int[] input, int output) {
    int result = FindMax.findMaxSumSubArray(input);
    assertEquals(output, result);
  }
}