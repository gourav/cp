package com.leetcode;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 *
 *
 * Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeros_Problem283 {

  /**
   * Apprach One:
   * ==
   * Runtime: 2619 ms, faster than 5.08% of Java online submissions for Move Zeroes.
   * Memory Usage: 43.9 MB, less than 84.24% of Java online submissions for Move Zeroes.
   *
  public void moveZeroes(int[] nums) {

    int left = 0; int right = nums.length - 1, zeros = countZeros(nums), handled = 0;

    while(left <= right && handled <= zeros) {

      int element = nums[left];
      if (element == 0) {

        int offset = offsetForNextNonZeroElement(nums, left);
        for (int i = 1; i <= offset; i++) {
          shiftLeft(nums, left, right);
          nums[right] = 0;
        }

        handled++;
      }

      left++;

    }

  }

  private void shiftLeft(int[] nums, int start, int end) {
    if (end - start >= 0) System.arraycopy(nums, start + 1, nums, start, end - start);
  }

  private int offsetForNextNonZeroElement(int[] nums, int current) {

    int offset = 0;

    while(current < nums.length) {
      if(nums[current++] != 0) {
        return offset;
      }

      offset++;
    }

    return offset;

  }

  private int countZeros(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if(num == 0) {
        count++;
      }
    }

    return count;
  } */

  void moveZeroes(int nums[]) {

    /*
     * Approach Two:
     * ==
     * Runtime: 1 ms, faster than 100.00% of Java online submissions for Move Zeroes.
     * Memory Usage: 43.6 MB, less than 91.84% of Java online submissions for Move Zeroes.
     */
    int index = 0;

    for (int i = 0; i < nums.length; i++) {
      if(nums[i] != 0) {
        nums[index++] = nums[i];
      }
    }

    for (int i = index; i < nums.length; i++) {
      nums[i] = 0;
    }

  }



}
