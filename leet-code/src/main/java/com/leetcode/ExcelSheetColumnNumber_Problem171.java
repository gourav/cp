package com.leetcode;

import java.util.Arrays;

/**
 * Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 *
 *
 * Example 1:
 *
 * Input: columnTitle = "A"
 * Output: 1
 * Example 2:
 *
 * Input: columnTitle = "AB"
 * Output: 28
 * Example 3:
 *
 * Input: columnTitle = "ZY"
 * Output: 701
 *
 *
 * Constraints:
 *
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 */
public class ExcelSheetColumnNumber_Problem171 {

  public int titleToNumber(String columnTitle) {

    /*
     * Approach One:
     * =============
     * Runtime: 11 ms
     * Memory Usage: 43.2 MB
     *
     *  byte[] bytes = columnTitle.getBytes();
        System.out.println(Arrays.toString(bytes));

        int total = 0, at = bytes.length - 1, power = 0;
        while(at >= 0) {
          total += (bytes[at--] - RADIX_OFFSET ) * Math.pow(RADIX, power++);

        }

        return total;
     */

    /*
     * Approach Two:
     * ===
     * Runtime: 2 ms, faster than 73.40% of Java online submissions for Excel Sheet Column Number.
     * Memory Usage: 42.4 MB, less than 75.44% of Java online submissions for Excel Sheet Column Number.
     */
    int total = 0, power = 1;
    for (int i = columnTitle.length() -1; i >= 0; i--) {
      total += (columnTitle.charAt(i) - 'A' + 1) * power;
      power *= 26;
    }

    return total;

  }

}
