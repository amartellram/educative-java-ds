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
        Arguments.of(new int[]{1, 2, 3, 4}, 11)
    );
  }
  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void findMaxSumSubArray() {
  }
}