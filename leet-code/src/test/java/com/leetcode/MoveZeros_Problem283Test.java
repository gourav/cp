package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeros_Problem283Test {

  @Test
  void shouldReturnOneThreeTwelveZeroZero_whenInputIsZeroOneZeroThreeTwelve() {

    MoveZeros_Problem283 sut = new MoveZeros_Problem283();
    int[] input = {0, 1, 0, 3, 12 };

    sut.moveZeroes(input);
    assertArrayEquals(new int[]{1, 3, 12, 0, 0}, input);

  }

  @Test
  void shouldReturnZero_whenInputIsZero() {

    MoveZeros_Problem283 sut = new MoveZeros_Problem283();
    int[] input = {0};

    sut.moveZeroes(input);
    assertArrayEquals(new int[]{0}, input);

  }

  @Test
  void shouldReturnOneZeroZero_whenInputIsZeroZeroOne() {

    MoveZeros_Problem283 sut = new MoveZeros_Problem283();
    int[] input = {0, 0, 1};

    sut.moveZeroes(input);
    assertArrayEquals(new int[]{1, 0, 0}, input);
  }

}