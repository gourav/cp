package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindrome_Problem125Test {

  @Test
  public void shouldReturnTrue_whenInputIsA_man_a_plan_a_canal_panama() {

    ValidPalindrome_Problem125 sut = new ValidPalindrome_Problem125();
    assertTrue(sut.isPalindrome("A man, a plan, a canal: Panama"));

  }

  @Test
  public void shouldReturnFalse_whenInputIs_Race_a_car() {

    ValidPalindrome_Problem125 sut = new ValidPalindrome_Problem125();
    assertFalse(sut.isPalindrome("race a car"));

  }

  @Test
  public void shouldReturnTrue_whenInputIsBlankString() {

    ValidPalindrome_Problem125 sut = new ValidPalindrome_Problem125();
    assertTrue(sut.isPalindrome(" "));

  }

  @Test
  public void shouldReturnFalse_whenInputIsZeroP() {

    ValidPalindrome_Problem125 sut = new ValidPalindrome_Problem125();
    assertFalse(sut.isPalindrome("0P"));

  }



}