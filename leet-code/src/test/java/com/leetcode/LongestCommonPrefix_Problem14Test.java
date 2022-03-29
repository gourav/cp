package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefix_Problem14Test {

  @Test
  public void shouldReturnFl_whenInputsAreFlowerAndFlowAndFlight() {

    LongestCommonPrefix_Problem14 sut = new LongestCommonPrefix_Problem14();
    assertEquals("fl", sut.longestCommonPrefix(new String[]{ "flower", "flow", "flight" }));

  }

  @Test
  public void shouldReturnBlankString_whenInputsAreDogAndRaceCarAndCar() {

    LongestCommonPrefix_Problem14 sut = new LongestCommonPrefix_Problem14();
    assertEquals("", sut.longestCommonPrefix(new String[]{"dog", "racecar", "car" }));

  }

}