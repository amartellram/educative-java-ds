package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CheckRotateArrayTest {

  private static Stream<Arguments> inputAndOutput() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{5, 1, 2, 3, 4})
    );
  }

  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void rotateArray(int[] input, int[] output) {
    CheckRotateArray.rotateArray(input);
    assertArrayEquals(output, input);
  }

}