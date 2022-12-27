package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveEvenNumbersTest {

  private static Stream<Arguments> inputAndOutput() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 4, 5, 10, 6, 3}, new int[]{1, 5, 3}),
        Arguments.of(new int[]{32, 37, 10, 40, 11, 5}, new int[]{37, 11, 5}),
        Arguments.of(new int[]{7, 4, 9, 0, 2}, new int[]{7, 9})
    );
  }


  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void eliminateWithFor(int[] input, int[] output) {

    assertArrayEquals(output, RemoveEvenNumbers.eliminateWithFor(input));
  }

  @Test
  void eliminateWithIterator() {
    int[] input = {1, 2, 4, 5, 10, 6, 3};
    int[] output = {1, 5, 3};

    assertArrayEquals(output, RemoveEvenNumbers.eliminateWithIterator(input));
  }

  @Test
  void eliminateWithStream() {
    int[] input = {1, 2, 4, 5, 10, 6, 3};
    int[] output = {1, 5, 3};

    assertArrayEquals(output, RemoveEvenNumbers.eliminateWithStream(input));
  }
}