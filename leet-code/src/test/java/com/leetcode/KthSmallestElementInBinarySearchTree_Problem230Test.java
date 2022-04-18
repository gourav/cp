package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementInBinarySearchTree_Problem230Test {

  @Test
  void shouldReturnThree_whenInputIsFiveThreeSixTwoFourNullNUllOneAndTargetIsThree() {

    KthSmallestElementInBinarySearchTree_Problem230 sut = new KthSmallestElementInBinarySearchTree_Problem230();
    assertEquals(3, sut.kthSmallest(build(new Integer[]{5,3,6,2,4,null,null,1}), 3));

  }

  @Test
  void shouldReturnOne_whenInputIsThreeOneFourNullTwoAndTargetIsOne() {

    KthSmallestElementInBinarySearchTree_Problem230 sut = new KthSmallestElementInBinarySearchTree_Problem230();
    assertEquals(1, sut.kthSmallest(build(new Integer[]{3,1,4,null,2}), 1));

  }

  KthSmallestElementInBinarySearchTree_Problem230.TreeNode build(Integer[] array) {

    KthSmallestElementInBinarySearchTree_Problem230.TreeNode root = new KthSmallestElementInBinarySearchTree_Problem230.TreeNode(array[0]);
    for (int i = 1; i < array.length; i++) {
      if(array[i] != null) {
        root.insert(array[i]);
      }
    }

    return root;
  }

}