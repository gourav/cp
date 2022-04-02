package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 *
 * Note that division between two integers should truncate toward zero.
 *
 * It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.
 *
 *
 *
 * Example 1:
 *
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 * Example 2:
 *
 * Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 * Example 3:
 *
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 *
 *
 * Constraints:
 *
 * 1 <= tokens.length <= 104
 * tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
 */
public class EvaluateReversePolishNotation_Problem150 {

  public int evalRPN(String[] tokens) {

    /*
     * Approach One:
     * ===
     * Runtime: 6 ms, faster than 80.58% of Java online submissions for Evaluate Reverse Polish Notation.
     * Memory Usage: 44.2 MB, less than 46.11% of Java online submissions for Evaluate Reverse Polish Notation.
     */
    /*Deque<Integer> stack = new ArrayDeque<>();
    for(String token: tokens) {

      if(isOperator(token)) {

        int second = stack.pop();
        int first = stack.pop();

        int result = perform(first, second, token);
        stack.push(result);

      } else {
        stack.push(Integer.valueOf(token));
      }

    }

    return stack.pop();*/

    /*
     * Approach 2:
     * Runtime: 2 ms, faster than 99.91% of Java online submissions for Evaluate Reverse Polish Notation.
     * Memory Usage: 43.6 MB, less than 78.05% of Java online submissions for Evaluate Reverse Polish Notation.
     */
    int[] stackEmulator = new int[tokens.length];
    int top = 0;

    for(String token: tokens) {

      if(isOperator(token)) {

        int second = stackEmulator[--top];
        int first = stackEmulator[--top];

        int result = perform(first, second, token);
        stackEmulator[top++] = result;

      } else {
        stackEmulator[top++] = Integer.parseInt(token);
      }

    }

    return stackEmulator[0];

  }

  private boolean isOperator(String token) {
    return switch (token) {
      case "*", "/", "+", "-" -> true;
      default -> false;
    };

  }

  private int perform(int first, int second, String operation) {

    if ("+".equals(operation)) {
      return first + second;
    } else if( "-".equals(operation)) {
      return first - second;
    } else if( "*".equals(operation)) {
      return first * second;
    }

    return first / second;

  }

}
