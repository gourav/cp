package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingOrderSearchTree_Problem897Test {

  @Test
  void shouldBuildIncreatingOrderSearchTree_forTestCase() {

    IncreasingOrderSearchTree_Problem897 sut = new IncreasingOrderSearchTree_Problem897();
    assertEquals(build(new Integer[]{1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9}), sut.increasingBST(build(new Integer[]{5,3,6,2,4,null,8,1,null,null,null,7,9})) );

  }

  @Test
  void shouldBuildIncreasingOrderSearchTree_forTestCaseTwo()  {

    IncreasingOrderSearchTree_Problem897 sut = new IncreasingOrderSearchTree_Problem897();
    assertEquals(build(new Integer[]{1, null, 5, null, 7}), sut.increasingBST(build(new Integer[]{5, 1, 7})));

  }

  private static IncreasingOrderSearchTree_Problem897.TreeNode build(Integer[] array) {

    IncreasingOrderSearchTree_Problem897.TreeNode root = new IncreasingOrderSearchTree_Problem897.TreeNode(array[0]);
    for (int i = 1; i < array.length; i++) {
      if(array[i] != null) {
        IncreasingOrderSearchTree_Problem897.build(root, array[i]);
      }
    }

    return root;

  }

}