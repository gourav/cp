package com.leetcode;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
public class ValidPalindrome_Problem125 {

  public boolean isPalindrome(String s) {

    /*
     * Runtime: 2 ms, faster than 99.60% of Java online submissions for Valid Palindrome.
     * Memory Usage: 42.1 MB, less than 96.41% of Java online submissions for Valid Palindrome.
     */
    int first = 0, last = s.length() - 1;
    s = s.toLowerCase();

    while(first < last) {

      char charAtFirst = s.charAt(first);
      if(!isAlphanumeric(charAtFirst)) {
        first++;
        continue;
      }

      char charAtLast = s.charAt(last);
      if(!isAlphanumeric(charAtLast)) {
        last--;
        continue;
      }

      if(charAtFirst != charAtLast) {
        return false;
      }

      first++;
      last--;

    }

    return true;

  }

  private boolean isAlphanumeric(char ascii) {
    return ('A' <= ascii && ascii <= 'Z') || ( 'a' <= ascii && ascii <= 'z' ) || ( '0' <= ascii && ascii <= '9');
  }

}
