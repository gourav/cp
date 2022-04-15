package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrimBinarySearchTree_Problem669Test {

  @Test
  void shouldReturnOneNullTwo_whenInputIsOneZeroTwoAndLowIsOneAndHighIsTwo() {

    TrimBinarySearchTree_Problem669 sut = new TrimBinarySearchTree_Problem669();
    assertEquals(build(new Integer[]{1, null, 2}), sut.trimBST(build(new Integer[]{1, 0, 2}), 1, 2));

  }

  @Test
  void shouldReturnThreeTwoNullOne_whenInputIsThreeZeroFourNullTwoNullNullOneAndLowIsOneAndHighIsThree() {

    TrimBinarySearchTree_Problem669 sut = new TrimBinarySearchTree_Problem669();
    assertEquals(build(new Integer[]{3, 2, null, 1}), sut.trimBST(build(new Integer[]{3,0,4,null,2,null,null,1}), 1, 3));

  }

  private TrimBinarySearchTree_Problem669.TreeNode build(Integer[] nodes) {

    TrimBinarySearchTree_Problem669.TreeNode tree = null;

    for (Integer node : nodes) {
      if(node != null) {
        if (tree == null) {
          tree = new TrimBinarySearchTree_Problem669.TreeNode(node);
        } else {
          TrimBinarySearchTree_Problem669.insert(tree, node);
        }
      }
    }

    return tree;

  }

}