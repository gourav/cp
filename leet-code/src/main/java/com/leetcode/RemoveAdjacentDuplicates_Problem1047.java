package com.leetcode;

import java.util.Arrays;

/**
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
 *
 * We repeatedly make duplicate removals on s until we no longer can.
 *
 * Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abbaca"
 * Output: "ca"
 * Explanation:
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
 * Example 2:
 *
 * Input: s = "azxxzy"
 * Output: "ay"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 */
public class RemoveAdjacentDuplicates_Problem1047 {

    public String removeDuplicates(String s) {

        /* Approach One:
         * ===
         * Runtime: 16 ms, faster than 75.68% of Java online submissions for Remove All Adjacent Duplicates In String.
         * Memory Usage: 43 MB, less than 86.96% of Java online submissions for Remove All Adjacent Duplicates In String.
         *
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();

        for(char character : chars) {

            if(Character.valueOf(character).equals(stack.peek())) {
                stack.pop();
            } else {
                stack.push(character);
            }

        }

        StringBuilder builder = new StringBuilder();
        for (Iterator<Character> it = stack.descendingIterator(); it.hasNext(); ) {
            builder.append(it.next());

        }

        return builder.toString();

         */

        /*
         * Approach Two:
         * ===
         * Runtime: 3 ms, faster than 99.99% of Java online submissions for Remove All Adjacent Duplicates In String.
         * Memory Usage: 42.6 MB, less than 95.28% of Java online submissions for Remove All Adjacent Duplicates In String.
         */
        char[] stack = new char[s.length()];
        int top = 0;
        char[] characters = s.toCharArray();

        for(char character : characters) {

            if(top != 0 && stack[top - 1] == character) {
                top--;
            } else {
                stack[top++] = character;
            }

        }

        return new String(Arrays.copyOfRange(stack, 0, top));


    }

}
