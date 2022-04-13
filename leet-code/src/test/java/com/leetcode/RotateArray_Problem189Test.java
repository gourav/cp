package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArray_Problem189Test {

    @Test
    void shouldRotateArrayByThree() {

        RotateArray_Problem189 sut = new RotateArray_Problem189();
        int[] input = new int[]{1,2,3,4,5,6,7};
        sut.rotate(input, 3);
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, input);

    }

    @Test
    void shouldRotateArrayByTwo() {

        RotateArray_Problem189 sut = new RotateArray_Problem189();
        int[] input = {-1, -100, 3, 99};
        sut.rotate(input, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, input);


    }

}