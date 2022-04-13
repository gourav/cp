package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixII_Problem59Test {

    @Test
    void shouldReturnSpiralMatrix_whenInputIsThree() {

        SpiralMatrixII_Problem59 sut = new SpiralMatrixII_Problem59();
        assertArrayEquals(new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        }, sut.generateMatrix(3));

    }

    @Test
    void shouldReturnSpiralMatrix_whenInputIsOne() {

        SpiralMatrixII_Problem59 sut = new SpiralMatrixII_Problem59();
        assertArrayEquals(new int[][]{{1}}, sut.generateMatrix(1));

    }

}