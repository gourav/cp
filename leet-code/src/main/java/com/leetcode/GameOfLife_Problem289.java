package com.leetcode;

/**
 * According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 * <p>
 * The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
 * <p>
 * Any live cell with fewer than two live neighbors dies as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population.
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
 * Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
 * Example 2:
 * <p>
 * <p>
 * Input: board = [[1,1],[1,0]]
 * Output: [[1,1],[1,1]]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 25
 * board[i][j] is 0 or 1.
 */
public class GameOfLife_Problem289 {

  final int[][] DIRECTIONS = {{1, -1}, {1, 0}, {1, 1}, {0, -1}, {0, 1}, {-1, -1}, {-1, 0}, {-1, 1}};

  public void gameOfLife(int[][] board) {

    /*
     * Approach 1:
     * ==
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Game of Life.
     * Memory Usage: 42.5 MB, less than 41.80% of Java online submissions for Game of Life.
     */
    int row = board.length;
    int column = board[0].length;

    int[][] output = new int[row][column];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {

        int totalPopulation = getPopulation(board, i, j, row, column);

        if (board[i][j] == 1) {

          if (totalPopulation < 2) {
            output[i][j] = 0;
          }  else if(totalPopulation == 2 || totalPopulation == 3) {
            output[i][j] = board[i][j];
          } else {
            output[i][j] = 0;
          }

        } else {

          if (totalPopulation == 3) {
            output[i][j] = 1;
          }

        }

      }
    }

    for (int i = 0; i < row; i++) {
      System.arraycopy(output[i], 0, board[i], 0, column);
    }

  }

  private int getPopulation(int[][] board, int row, int column, int maxRows, int maxColumns) {
    int population = 0;

    for (int[] direction : DIRECTIONS) {
      int atRow = row + direction[0];
      int atColumn = column + direction[1];

      if (0 <= atRow && atRow < maxRows && 0 <= atColumn && atColumn < maxColumns && board[atRow][atColumn] == 1) {
        population++;
      }

    }

    return population;

  }

}
