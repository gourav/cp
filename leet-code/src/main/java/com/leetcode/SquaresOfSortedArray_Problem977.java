package com.leetcode;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 */
public class SquaresOfSortedArray_Problem977 {

    public int[] sortedSquares(int[] nums) {

        /*
         * Approach One:
         * ===
         * Works, but runs out of time.
         *
        final int MAX = 100000001;

        int[] counts = new int[MAX];
        int[] output = new int[nums.length];

        for (int num : nums) {
            counts[num * num]++;
        }

        for (int i = 1; i < MAX; i++) {
            counts[i]+= counts[i-1];
        }

        for (int num : nums) {
            int square = num * num;
            output[counts[square] - 1] = square;
            counts[square]--;
        }

        return output;*/

        /*
         * Runtime:
         * ==
         * Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
         * Memory Usage: 44.2 MB, less than 85.00% of Java online submissions for Squares of a Sorted Array.
         */
        int left = 0, right = nums.length -1;
        int[] output = new int[nums.length];
        int at = right;

        while(left <= right) {

            int atRight = Math.abs(nums[right]);
            int atLeft = Math.abs(nums[left]);

            if(atRight > atLeft) {
                output[at--] = atRight * atRight;
                right--;
            } else {
                output[at--] = atLeft * atLeft;
                left++;
            }


        }

        return output;


    }

}
