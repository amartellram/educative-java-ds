package io.amartell.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveEvenNumbersTest {


  @Test
  void eliminateWithFor() {
    int[] input = {1, 2, 4, 5, 10, 6, 3};
    int[] output = {1, 5, 3};

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