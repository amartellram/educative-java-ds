package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FirstNonRepeatingIntegerTest {

  private static Stream<Arguments> inputAndOutput() {
    return Stream.of(
        Arguments.of(new int[]{4, 5, 1, 2, 0, 4}, 5),
        Arguments.of(new int[]{4, 4, 4, 3}, 3)

    );
  }

  @ParameterizedTest
  @MethodSource("inputAndOutput")
  void findFirstUnique(int[] input, int unique) {
    int result = FirstNonRepeatingInteger.findFirstUnique(input);
    assertEquals(unique, result);
  }
}