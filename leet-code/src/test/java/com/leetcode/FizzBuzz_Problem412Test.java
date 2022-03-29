package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzz_Problem412Test {

  @Test
  public void shouldReturnOneTwoFizz_whenInputIsThree() {
    FizzBuzz_Problem412 sut = new FizzBuzz_Problem412();
    assertEquals(List.of("1", "2", "Fizz"), sut.fizzBuzz(3));
  }

  @Test
  public void shouldReturnOneTwoFizzFourBuzz_whenInputIsFive() {
    FizzBuzz_Problem412 sut = new FizzBuzz_Problem412();
    assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), sut.fizzBuzz(5));
  }

  @Test
  public void shouldReturnOneTwoFizzFourBuzzFizzSevenEightFizzBuzzElevenFizzThieteenFourteenFizzBuzz_whenInputIsFifteen() {
    FizzBuzz_Problem412 sut = new FizzBuzz_Problem412();
    assertEquals(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), sut.fizzBuzz(15));
  }

}