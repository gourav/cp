package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWord_Problem58Test {

  @Test
  void shouldReturnFive_whenInputIsHelloWorld() {
    LengthOfLastWord_Problem58 sut = new LengthOfLastWord_Problem58();
    assertEquals(5, sut.lengthOfLastWord("Hello World"));
  }

  @Test
  void shouldReturnFour_whenInputIsFlyMeToTheMoon() {
    LengthOfLastWord_Problem58 sut = new LengthOfLastWord_Problem58();
    assertEquals(4, sut.lengthOfLastWord("   fly me   to   the moon  "));
  }

  @Test
  void shouldReturnFive_whenInputIsLuffyIsStillJoybo() {
    LengthOfLastWord_Problem58 sut = new LengthOfLastWord_Problem58();
    assertEquals(6, sut.lengthOfLastWord("luffy is still joyboy"));
  }

  @Test
  void shouldReturnOne_whenInputIsA() {
    LengthOfLastWord_Problem58 sut = new LengthOfLastWord_Problem58();
    assertEquals(1, sut.lengthOfLastWord("a"));
  }
}