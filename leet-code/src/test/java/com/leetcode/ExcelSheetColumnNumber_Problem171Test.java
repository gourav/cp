package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnNumber_Problem171Test {

  @Test
  public void shouldReturnOne_whenInputIsA() {

    ExcelSheetColumnNumber_Problem171 sut = new ExcelSheetColumnNumber_Problem171();
    assertEquals(1, sut.titleToNumber("A"));

  }

  @Test
  public void shouldReturnTwentyEight_whenInputIsAb() {

    ExcelSheetColumnNumber_Problem171 sut = new ExcelSheetColumnNumber_Problem171();
    assertEquals(28, sut.titleToNumber("AB"));

  }

  @Test
  public void shouldReturnSevenHundredOne_whenInputIsZy() {

    ExcelSheetColumnNumber_Problem171 sut = new ExcelSheetColumnNumber_Problem171();
    assertEquals(701, sut.titleToNumber("ZY"));

  }


}