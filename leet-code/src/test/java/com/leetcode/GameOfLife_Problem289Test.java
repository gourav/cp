package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLife_Problem289Test {

  @Test
  void shouldSatisfySequenceOne() {

    int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
    GameOfLife_Problem289 sut = new GameOfLife_Problem289();
    sut.gameOfLife(board);

    assertArrayEquals(new int[][]{{0,0,0},{1,0,1},{0,1,1},{0,1,0}}, board);
  }

  @Test
  void shouldSatifySequenceTwo() {

    int[][] board = {{1,1},{1,0}};
    GameOfLife_Problem289 sut = new GameOfLife_Problem289();
    sut.gameOfLife(board);

    assertArrayEquals(new int[][]{{1,1},{1,1}}, board);

  }

  @Test
  void shouldSatisfySequenceThree() {

    int[][] board = {
      {1,0,1,0,1,1,0,0,0,0,1,1,1,0,1,1,0,0,1,0,0},
      {1,1,0,1,1,1,0,0,1,1,1,1,1,0,0,1,1,0,1,0,1},
      {0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,0,0,0,1},
      {1,0,1,1,0,0,0,1,1,1,0,1,1,0,0,1,0,1,1,0,0},
      {1,1,0,1,1,0,1,1,0,1,1,1,1,0,0,0,0,0,0,1,1},
      {1,1,1,1,1,1,1,0,0,1,0,1,0,0,1,0,1,1,1,1,0},
      {0,1,0,1,1,1,1,1,0,0,1,1,0,0,0,1,0,1,1,1,0},
      {0,0,1,0,0,1,1,1,0,1,0,1,0,0,1,1,1,0,1,0,0},
      {0,0,1,0,1,1,1,1,1,0,0,1,1,1,0,0,0,0,1,1,1},
      {0,0,0,0,0,0,0,1,0,1,1,1,1,0,0,0,1,0,1,0,1},
      {0,0,0,0,1,1,1,0,0,0,1,1,1,0,0,1,1,0,1,1,1},
      {0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,1,1,0,0,0,1,1,1,1,0,0,0,1,0,1,0,0},
      {1,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,0,1,0,1,1},
      {1,1,0,0,0,1,0,1,0,1,0,1,1,1,1,0,1,1,0,1,1},
      {0,0,1,1,1,1,0,0,1,1,1,1,0,1,0,1,0,1,0,1,0},
      {0,0,0,0,0,1,0,0,0,1,1,1,0,1,0,0,1,0,0,0,1},
      {0,0,1,0,1,0,1,0,1,1,0,1,1,0,1,0,0,1,1,0,1},
      {1,0,1,1,0,1,1,0,0,1,0,1,1,0,1,1,0,0,1,0,1},
      {1,0,1,1,0,1,0,0,1,0,0,1,1,0,1,1,1,0,1,1,0},
      {1,1,1,1,0,1,1,1,0,0,1,1,1,1,1,1,1,0,0,1,1}
    };
    GameOfLife_Problem289 sut = new GameOfLife_Problem289();
    sut.gameOfLife(board);

    assertArrayEquals(new int[][]{
        {1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0},
        {1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
        {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1},
        {0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1},
        {0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0},
        {0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0},
        {1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0},
        {0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1},
        {0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1},
        {0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
        {1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}
      }, board);

  }

}