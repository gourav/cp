package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotation_Problem150Test {

  @Test
  void shouldReturn9_whenExpressionIsTwoOnePlusThreeMultiply() {

    EvaluateReversePolishNotation_Problem150 sut = new EvaluateReversePolishNotation_Problem150();
    assertEquals(9, sut.evalRPN(new String[]{"2","1","+","3","*"}));

  }

  @Test
  void shouldReturn6_whenExpressionIsFourThirteenFiveDividePlus() {

    EvaluateReversePolishNotation_Problem150 sut = new EvaluateReversePolishNotation_Problem150();
    assertEquals(6, sut.evalRPN(new String[]{"4","13","5","/","+"}));

  }

  @Test
  void shouldReturn22_whenExpressionIsTenSixNineThreePlusNegativeElevenMultiplyDivideMultiplySeventeenPlusFivePlus() {

    EvaluateReversePolishNotation_Problem150 sut = new EvaluateReversePolishNotation_Problem150();
    assertEquals(22, sut.evalRPN(new String[]{ "10","6","9","3","+","-11","*","/","*","17","+","5","+" }));

  }

}