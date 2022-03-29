package com.leetcode;

import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
 * <p>
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 104
 */
public class FizzBuzz_Problem412 {

  public List<String> fizzBuzz(int n) {

            /*
         * Approach 1:
         * Runtime: 5 ms, faster than 8.35% of Java online submissions for Fizz Buzz.
         *
        return IntStream.rangeClosed(1, n)
                .mapToObj(number -> {

                    if(number % 15 == 0) {
                        return "FizzBuzz";
                    } else if(number % 5 == 0) {
                        return "Buzz";
                    } else if(number % 3 == 0) {
                        return "Fizz";
                    } else {
                        return "" + number;
                    }

                })
                .collect(Collectors.toList());
         */

    /*
     * Approach Two:
     * Runtime: 1 ms, faster than 99.68% of Java online submissions for Fizz Buzz.
     * ===
     */
    String[] mapped = new String[n];
    for (int number = 1; number <= n; number++) {

      if (number % 15 == 0) {
        mapped[number - 1] = "FizzBuzz";
      } else if (number % 5 == 0) {
        mapped[number - 1] = "Buzz";
      } else if (number % 3 == 0) {
        mapped[number - 1] = "Fizz";
      } else {
        mapped[number - 1] = Integer.toString(number);
      }

    }

    return List.of(mapped);

  }

}
