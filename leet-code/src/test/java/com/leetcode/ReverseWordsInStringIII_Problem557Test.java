package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringIII_Problem557Test {

  @Test
  void shouldReturn_teL_ekat_edoCteeL_tsetnoc_whenInputIsLet_s_take_LeetCode_contest() {

    ReverseWordsInStringIII_Problem557 sut = new ReverseWordsInStringIII_Problem557();
    assertEquals("s'teL ekat edoCteeL tsetnoc", sut.reverseWords("Let's take LeetCode contest"));

  }

  @Test
  void shouldReturndoG_gniD_whenInputIsGod_Ding() {

    ReverseWordsInStringIII_Problem557 sut = new ReverseWordsInStringIII_Problem557();
    assertEquals("doG gniD", sut.reverseWords("God Ding"));

  }

}