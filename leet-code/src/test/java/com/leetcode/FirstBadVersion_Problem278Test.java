package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersion_Problem278Test {

  @Test
  public void shouldReturnFour_whenInputIsFiveAndFirstBadVersionReturnedIs4ByApi() {

    FirstBadVersion_Problem278 sut = new FirstBadVersion_Problem278();
    assertEquals(4, sut.firstBadVersion(5));

  }

  @Test
  public void shouldReturnOne_whenInputIsOneAndFirstBadVersionIsOneByApI() {

    FirstBadVersion_Problem278 sut = new FirstBadVersion_Problem278();
    assertEquals(1, sut.firstBadVersion(1));

  }

}