package com.leetcode;

/**
 * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal substring consisting of non-space characters only.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * Example 2:
 * <p>
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * Example 3:
 * <p>
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 */
public class LengthOfLastWord_Problem58 {

  public int lengthOfLastWord(String setence) {

    setence = setence.trim();

    if (setence.length() == 0) {
      return 0;
    }

    /*
     * Approach One.
     * Runtime: 1 ms, faster than 48.96% of Java online submissions for Length of Last Word.
     * ====
     * String[] parts = setence.split(" ");
     * return parts[parts.length -1].length();
     */

    /*
     * Approach Two.
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
     */
    char[] characters = setence.toCharArray();
    int count = 0;
    int at = characters.length - 1;
    boolean foundFirstNonWhiteSpaceCharacter = false;

    while (at >= 0) {

      if(characters[at] != ' ') {
        count++;
        at--;
        foundFirstNonWhiteSpaceCharacter = true;
        continue;
      }

      if(foundFirstNonWhiteSpaceCharacter &&  characters[at] == ' ') {
        return count;
      }

      at--;

    }

    return count;
  }

}
