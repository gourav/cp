package com.leetcode;

import java.util.stream.IntStream;

/**
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aba"
 * Output: true
 * Example 2:
 *
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * Example 3:
 *
 * Input: s = "abc"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 */
public class ValidPalindromeTwo_Problem680 {

  public boolean validPalindrome(String s) {

    /*
     * Approach 1:
     * Time limit exceeded. :(
     */
    /*int trial = 0, attempts = s.length();
    StringBuilder builder = new StringBuilder(s);

    while (trial < attempts) {

      builder.deleteCharAt(trial);
      String withRemovedChar = builder.toString();
      String reversed = builder.reverse().toString();

      if(withRemovedChar.equals(reversed)) {
        return true;
      }

      builder.reverse().insert(trial, s.charAt(trial));
      trial++;

    }

    return false;*/

    /*
     * Approach 2:
     * ===========
     * Runtime: 7 ms, faster than 83.59% of Java online submissions for Valid Palindrome II.
     * Memory Usage: 55.4 MB, less than 15.91% of Java online submissions for Valid Palindrome II.
     */
    int length = s.length();

    if(length <= 2) {
      return true;
    }

    byte[] chars = s.getBytes();
    for(int first = 0, last = length -1; first < last; first++, last--) {
      if(chars[first] != chars[last]) {
        return isPalindrome(chars, first, last - 1) || isPalindrome(chars, first + 1, last);
      }
    }

    return true;

  }

  boolean isPalindrome(byte[] chars, int first, int last) {
    for(; first < last; first++, last--) {
      if(chars[first] != chars[last]) {
        return false;
      }
    }

    return true;
  }

}
