package com.leetcode;

/**
 * You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.
 *
 * We repeatedly make k duplicate removals on s until we no longer can.
 *
 * Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcd", k = 2
 * Output: "abcd"
 * Explanation: There's nothing to delete.
 * Example 2:
 *
 * Input: s = "deeedbbcccbdaa", k = 3
 * Output: "aa"
 * Explanation:
 * First delete "eee" and "ccc", get "ddbbbdaa"
 * Then delete "bbb", get "dddaa"
 * Finally delete "ddd", get "aa"
 * Example 3:
 *
 * Input: s = "pbbcggttciiippooaais", k = 2
 * Output: "ps"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * 2 <= k <= 104
 * s only contains lower case English letters.
 */
public class RemoveAdjacentDuplicates_Problem1209 {

  public String removeDuplicates(String s, int k) {

    /*
     * Approach 1:
     * ===
     * Runtime: 19 ms, faster than 86.18% of Java online submissions for Remove All Adjacent Duplicates in String II.
Memory Usage: 51.2 MB, less than 47.71% of Java online submissions for Remove All Adjacent Duplicates in String II.
     *
     *
    Deque<LetterToCountPair> stack = new ArrayDeque<>();
    char[] characters = s.toCharArray();

    for(char character: characters) {

      LetterToCountPair top = stack.peek();

      if(top != null && character == top.letter && (k-1) == top.count) {
        stack.pop();
      } else if(top != null && character == top.letter) {
        top.count++;
      } else {
        stack.push(new LetterToCountPair(character));
      }

    };

    StringBuilder builder = new StringBuilder();
    for (Iterator<LetterToCountPair> it = stack.descendingIterator(); it.hasNext(); ) {
      builder.append(it.next().toString());

    }

    return builder.toString(); */

    /*
     * Approach Two:
     * ===
     * Runtime: 12 ms, faster than 91.67% of Java online submissions for Remove All Adjacent Duplicates in String II.
     * Memory Usage: 51.6 MB, less than 46.54% of Java online submissions for Remove All Adjacent Duplicates in String II.
     */
    LetterToCountPair[] stack = new LetterToCountPair[s.length()];
    int top = 0;
    char[] characters = s.toCharArray();

    for(char character: characters) {

      LetterToCountPair atTop = null;

      if(top != 0 && ((atTop = stack[top-1]) != null) && atTop.letter == character && atTop.count == (k-1)) {
        top--;
      } else if(atTop != null && character == atTop.letter) {
        atTop.count++;
      } else {
        stack[top++] = new LetterToCountPair(character);
      }

    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < top; i++) {
      builder.append(stack[i]);
    }

    return builder.toString();

  }

  private static class LetterToCountPair {

     private final char letter;
     private int count;

     public LetterToCountPair(char letter) {
       this.letter = letter;
       this.count = 1;
     }

    @Override
    public String toString() {
      return String.valueOf(letter).repeat(Math.max(0, count));
    }

  }

}
