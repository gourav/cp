package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearch_Problem704Test {

  @Test
  void shouldReturnFour_whenInputIsMinusOneZeroThreeFiveNineTwelveAndTargetIsNine() {

    BinarySearch_Problem704 sut = new BinarySearch_Problem704();
    assertEquals(4, sut.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));

  }

  @Test
  public void shouldReturnMinusOne_whenInputIsMinusOneZeroThreeFiveNineTwelveAndTargetIsTwo() {

    BinarySearch_Problem704 sut = new BinarySearch_Problem704();
    assertEquals(-1, sut.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));

  }

  @Test
  public void shouldReturnOne_whenInputIsMinusOneZeroThreeFiveNineTwelveAndTargetIsZero() {

    BinarySearch_Problem704 sut = new BinarySearch_Problem704();
    assertEquals(1, sut.search(new int[]{-1, 0, 3, 5, 9, 12}, 0));

  }

}