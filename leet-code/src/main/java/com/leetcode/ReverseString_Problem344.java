package com.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 */
public class ReverseString_Problem344 {

  public char[] reverseString(char[] s) {

    /*
     * Approach 1:
     * Runtime: 13 ms, faster than 5.47% of Java online submissions for Reverse String.
     * ===
     *     Stack<Character> stack = new Stack<>();
          for(char c : s) {
            stack.push(c);
          }

          for (int i = 0; i < s.length; i++) {
            s[i] = stack.pop();
          }

          return s;
     */

    /*
     * Approach 2
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse String.
     * ===
     */

    for (int at = 0; at < s.length / 2; at++) {
      char temp = s[at];
      s[at] = s[s.length - at - 1];
      s[s.length - at - 1] = temp;
    }

    return s;
  }

}
