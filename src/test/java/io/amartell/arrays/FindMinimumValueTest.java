package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindMinimumValueTest {

  private static Stream<Arguments> inputAndOutput() {
    return Stream.of(
        Arguments.of(new int[]{100, 12, 34, 40}, 12),
        Arguments.of(new int[]{4, 5, 0, 3, 6}, 0)
    );
  }

  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void findMinimum(int[] input, int min) {
    int result = FindMinimumValue.findMinimum(input);
    assertEquals(min, result);
  }
}