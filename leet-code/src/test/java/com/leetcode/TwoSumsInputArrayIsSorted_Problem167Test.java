package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumsInputArrayIsSorted_Problem167Test {
  
  @Test
  void shouldReturnOneTwo_whenInputIsTwoSevenElevenFifteenAndTargetIsNine() {

    TwoSumsInputArrayIsSorted_Problem167 sut = new TwoSumsInputArrayIsSorted_Problem167();
    assertArrayEquals(new int[]{1, 2}, sut.twoSum(new int[]{2, 7, 11, 15}, 9));
    
  }

  @Test
  void shouldReturnOneThree_whenInputIsTwoThreeFourAndTargetIsSix() {

    TwoSumsInputArrayIsSorted_Problem167 sut = new TwoSumsInputArrayIsSorted_Problem167();
    assertArrayEquals(new int[]{1, 3}, sut.twoSum(new int[]{2, 3, 4}, 6));

  }

  @Test
  void shouldReturnOneTwo_whenInputIsMinusOneAndTargetIsMinusOne() {

    TwoSumsInputArrayIsSorted_Problem167 sut = new TwoSumsInputArrayIsSorted_Problem167();
    assertArrayEquals(new int[]{1, 2}, sut.twoSum(new int[]{-1, 0}, -1));

  }

}