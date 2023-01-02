package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindSecondMaximumValueTest {

  private static Stream<Arguments> inputAndOutput() {
    return Stream.of(
        Arguments.of(new int[]{9, 2, 3, 6}, 6),
        Arguments.of(new int[]{4, 2, 1, 5, 0}, 4)
    );
  }

  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void findSecondMaximum(int[] input, int output) {
    int result = FindSecondMaximumValue.findSecondMaximum(input);
    assertEquals(output, result);
  }
}