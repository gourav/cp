package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPosition_Problem35Test {

  @Test
  void shouldReturnTwo_whenInputIsOneThreeFiveSixAndTargetIsFive() {

    SearchInsertPosition_Problem35 sut = new SearchInsertPosition_Problem35();
    assertEquals(2, sut.searchInsert(new int[]{1, 3, 5, 6}, 5));

  }

  @Test
  void shouldReturnOne_whenInputIsOneThreeFiveSixAndTargetIsTwo() {

    SearchInsertPosition_Problem35 sut = new SearchInsertPosition_Problem35();
    assertEquals(1, sut.searchInsert(new int[]{1, 3, 5, 6}, 2));

  }

  @Test
  void shouldReturnFour_whenInputIsOneThreeFiveSixAndTargetIsSeven() {

    SearchInsertPosition_Problem35 sut = new SearchInsertPosition_Problem35();
    assertEquals(4, sut.searchInsert(new int[]{1, 3, 5, 6}, 7));

  }

}