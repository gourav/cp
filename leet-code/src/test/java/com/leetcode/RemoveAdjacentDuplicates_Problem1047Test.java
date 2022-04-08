package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAdjacentDuplicates_Problem1047Test {

    @Test
    public void shouldReturnCa_whenInputIsAbbaca() {

        RemoveAdjacentDuplicates_Problem1047 sut = new RemoveAdjacentDuplicates_Problem1047();
        assertEquals("ca", sut.removeDuplicates("abbaca"));

    }

    @Test
    public void shouldReturnAy_whenInputIsAzxxzy() {

        RemoveAdjacentDuplicates_Problem1047 sut = new RemoveAdjacentDuplicates_Problem1047();
        assertEquals("ay", sut.removeDuplicates("azxxzy"));

    }

    @Test
    public void shouldReturnA_whenInputIsaaaaaaaaa() {

        RemoveAdjacentDuplicates_Problem1047 sut = new RemoveAdjacentDuplicates_Problem1047();
        assertEquals("a", sut.removeDuplicates("aaaaaaaaa"));

    }

}