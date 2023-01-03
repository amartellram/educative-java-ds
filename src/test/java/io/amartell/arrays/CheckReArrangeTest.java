package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CheckReArrangeTest {

  private static Stream<Arguments> inputAndOutput() {
    return Stream.of(
        Arguments.of(new int[]{10, -1, 20, 4, 5, -9, -6})
    );
  }

  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void reArrange(int[] input) {
    CheckReArrange.reArrange(input);
    assertArrayEquals(new int[]{-1, -9, -6, 4, 5, 10, 20}, input);
  }

  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void reArrangeNew(int[] input) {
    CheckReArrange.reArrangeNew(input);
    System.out.println(Arrays.toString(input));
    assertArrayEquals(new int[]{-1, -9, -6, 10, 20, 4, 5}, input);
  }

  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void reArrangeSwap(int[] input) {
    CheckReArrange.reArrangeSwap(input);
    System.out.println(Arrays.toString(input));
    assertArrayEquals(new int[]{-1, -9, -6, 4, 5, 10, 20}, input);
  }
}