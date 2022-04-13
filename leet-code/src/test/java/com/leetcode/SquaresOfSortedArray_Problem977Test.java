package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArray_Problem977Test {

    @Test
    void shouldReturnZeroOneNineSixteenHundred_whenInputIsMinusFourMinusOneZeroThreeTen() {

        SquaresOfSortedArray_Problem977 sut = new SquaresOfSortedArray_Problem977();
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, sut.sortedSquares(new int[]{-4, -1, 0, 3, 10}));

    }

    @Test
    void shouldReturnFourNineNineFourtyNineOneHundredTwentyOne_whenInputIsMinusSevenMinusThreeTwoThreeEleven() {

        SquaresOfSortedArray_Problem977 sut = new SquaresOfSortedArray_Problem977();
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, sut.sortedSquares(new int[]{-7, -3, 2, 3, 11}));

    }

    @Test
    void shouldReturnSquaresInSortedOrder() {

        SquaresOfSortedArray_Problem977 sut = new SquaresOfSortedArray_Problem977();
        assertArrayEquals(new int[]{0, 0, 25, 49, 99980001, 100000000, 100000000}, sut.sortedSquares(new int[]{-10000,-9999,-7,-5,0,0,10000}));

    }
}