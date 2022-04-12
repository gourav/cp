package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAdjacentDuplicates_Problem1209Test {

  @Test
  void shouldReturnAbcd_whenInputIsAbcdAndKIsTwo() {

    RemoveAdjacentDuplicates_Problem1209 sut = new RemoveAdjacentDuplicates_Problem1209();
    assertEquals("abcd", sut.removeDuplicates("abcd", 2));

  }

  @Test
  void shouldReturnAa_whenInputIsDeedbbcccbdaaAndKIsThree() {

    RemoveAdjacentDuplicates_Problem1209 sut = new RemoveAdjacentDuplicates_Problem1209();
    assertEquals("aa", sut.removeDuplicates("deeedbbcccbdaa", 3));

  }

  @Test
  void shouldReturnPs_whenInputIsPbbcggttciiippooaaisAndKIsTwo() {

    RemoveAdjacentDuplicates_Problem1209 sut = new RemoveAdjacentDuplicates_Problem1209();
    assertEquals("ps", sut.removeDuplicates("pbbcggttciiippooaais", 2));

  }

}