package com.leetcode;

/**
 * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: n = 3
 * Output: [[1,2,3],[8,9,4],[7,6,5]]
 * Example 2:
 *
 * Input: n = 1
 * Output: [[1]]
 *
 *
 * Constraints:
 *
 * 1 <= n <= 20
 */
public class SpiralMatrixII_Problem59 {

    public int[][] generateMatrix(int n) {

        /*
         * Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix II.
         * Memory Usage: 40.5 MB, less than 82.25% of Java online submissions for Spiral Matrix II.
         */
        if(n == 1) {
            return new int[][]{{1}};
        }

        int[][] matrix = new int[n][n];

        int counter = 1;

        int top = 0, bottom = n - 1, left = 0, right = n -1;
        int direction = 1;

        while(top <= bottom && left <= right) {

            if(direction == 1) {

                for (int i = left; i <= right; i++) {
                    matrix[top][i] = counter++;
                }

                top++;
                direction = 2;

            } else if(direction == 2) {

                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = counter++;
                }

                right--;
                direction = 3;

            } else if(direction == 3) {

                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = counter++;
                }

                bottom--;
                direction = 4;

            } else {

                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = counter++;
                }

                left++;
                direction = 1;

            }

        }

        return matrix;

    }

}
