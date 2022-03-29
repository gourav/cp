package com.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 */
public class LongestCommonPrefix_Problem14 {

  public String longestCommonPrefix(String[] strs) {

    /*
     * Approach One:
     * Runtime: 1 ms, faster than 82.02% of Java online submissions for Longest Common Prefix.
     * ===
     *
     * StringBuilder prefix = new StringBuilder();
        int at = 0;

        int min = 200;

        for(String text : strs ) {
            min = Math.min(min, text.length());
        }

        while(at < min) {

            char first = strs[0].charAt(at);
            for(int from = 1; from < strs.length; from++) {
                if(first != strs[from].charAt(at)) {
                    return prefix.toString();
                }
            }

            prefix.append(first);
            at++;

        }

        return prefix.toString();
     */

    /*
     * Approach 2:
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Common Prefix.
     * ===
     */
    String minLengthString = null;
    int min = 201;

    for (String text : strs) {
      if (min > text.length()) {
        min = text.length();
        minLengthString = text;
      }
    }

    while (minLengthString != null && minLengthString.length() > 0) {

      boolean matchedAll = true;

      for (String text : strs) {
        if (!text.startsWith(minLengthString)) {
          matchedAll = false;
          break;
        }
      }

      if (matchedAll) {
        return minLengthString;
      }

      minLengthString = minLengthString.substring(0, minLengthString.length() - 1);

    }

    return "";

  }

}
