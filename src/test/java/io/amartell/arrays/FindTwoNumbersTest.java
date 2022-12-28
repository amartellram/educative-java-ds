package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindTwoNumbersTest {


  private static Stream<Arguments> inputAndOutput() {
    return Stream.of(
        Arguments.of(new int[]{1, 21, 3, 14, 5, 60, 7, 6}, 27, new int[]{21, 6}),
        Arguments.of(new int[]{9, 4, 7, 2, 6}, 17, new int[]{9, 4, 7, 2, 6}),
        Arguments.of(new int[]{5, 11, 4, 6}, 10, new int[]{4, 6})
    );
  }
  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void findSum(int[] input, int sum, int[] output) {
    int[] twoNumbers = FindTwoNumbers.findSum(input, sum);
    assertArrayEquals(output, twoNumbers);
  }
}