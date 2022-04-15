package com.leetcode;

import java.util.Arrays;

/**
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 *
 * Input: s = "God Ding"
 * Output: "doG gniD"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 5 * 10*4
 * s contains printable ASCII characters.
 * s does not contain any leading or trailing spaces.
 * There is at least one word in s.
 * All the words in s are separated by a single space.
 */
public class ReverseWordsInStringIII_Problem557 {

  public String reverseWords(String s) {

    /*
     * Approach One:
     * Runtime: 2 ms, faster than 99.91% of Java online submissions for Reverse Words in a String III.
     * Memory Usage: 43.1 MB, less than 84.61% of Java online submissions for Reverse Words in a String III.
     */
    byte[] bytes = s.getBytes();
    int left = 0;

    for (int i = 0; i < bytes.length; i++) {
      if(bytes[i] == 32) {
        reverse(bytes, left, i-1);
        left = i+1;
      }
    }

    reverse(bytes, left, bytes.length-1);

    return new String(bytes);

  }

  private void reverse(byte[] bytes, int left, int right) {
    while (left < right) {
      byte temp = bytes[left];
      bytes[left++] = bytes[right];
      bytes[right--] = temp;
    }
  }

}
