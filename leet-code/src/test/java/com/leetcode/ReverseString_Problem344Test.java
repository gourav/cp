package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseString_Problem344Test {

  @Test
  public void shouldReturnOllehWhenInputIsHello() {

    ReverseString_Problem344 sut = new ReverseString_Problem344();
    assertArrayEquals(new char[]{'o','l','l','e','h'}, sut.reverseString("hello".toCharArray()));

  }

  @Test
  public void shouldReturnhannHWhenInputIsHannah() {
    ReverseString_Problem344 sut = new ReverseString_Problem344();
    assertArrayEquals(new char[]{'h','a','n','n','a', 'H'}, sut.reverseString("Hannah".toCharArray()));
  }

}