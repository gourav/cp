package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTwo_Problem680Test {

  @Test
  public void shouldReturnTrue_whenInputIsAba() {

    ValidPalindromeTwo_Problem680 sut = new ValidPalindromeTwo_Problem680();
    assertTrue(sut.validPalindrome("aba"));

  }

  @Test
  public void shouldReturnTrue_whenInputIsAbca() {

    ValidPalindromeTwo_Problem680 sut = new ValidPalindromeTwo_Problem680();
    assertTrue(sut.validPalindrome("abca"));

  }

  @Test
  public void shouldReturnFalse_whenInputIsAbc() {

    ValidPalindromeTwo_Problem680 sut = new ValidPalindromeTwo_Problem680();
    assertFalse(sut.validPalindrome("abc"));

  }

}