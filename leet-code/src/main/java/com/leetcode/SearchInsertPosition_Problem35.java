package com.leetcode;

import java.util.Arrays;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
public class SearchInsertPosition_Problem35 {

  public int searchInsert(int[] nums, int target) {

    /*
     * Approach 1:
     * ===
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
     * Memory Usage: 43.3 MB, less than 62.11% of Java online submissions for Search Insert Position.
     *
    int result = Arrays.binarySearch(nums, target);
    return result >= 0 ? result : -result - 1;*/


    /*
     * Approach 2:
     * ===
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 43.9 MB, less than 26.13% of Java online submissions for Search Insert Position.
     */
    int left = 0;
    int right = nums.length - 1;

    while(left <= right) {

      int mid = (left + right) / 2;
      if(nums[mid] == target) {
        return mid;
      }

      if(nums[mid] < target) {
        left = mid+1;
      } else {
        right = mid-1;
      }

    }

    return left;

  }

}
