package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInBinarySearchTree_Problem700Test {

  @Test
  void shouldReturnTwoOneThree_whenInputIsFourTwoSevenOneTreeAndTargetIsTwo() {

    int[] nodes = {4, 2, 7, 1, 3};
    SearchInBinarySearchTree_Problem700.TreeNode tree = build(nodes);

    SearchInBinarySearchTree_Problem700 sut = new SearchInBinarySearchTree_Problem700();
    assertEquals(build(new int[]{2, 1, 3}), sut.searchBST(tree, 2));

  }

  @Test
  void shouldReturnNull_whenInputIsFourTwoSevenOneThreeAndTargetIsFive() {

    int[] nodes = {4, 2, 7, 1, 3};
    SearchInBinarySearchTree_Problem700.TreeNode tree = build(nodes);

    SearchInBinarySearchTree_Problem700 sut = new SearchInBinarySearchTree_Problem700();
    assertNull(sut.searchBST(tree, 5));

  }

  private SearchInBinarySearchTree_Problem700.TreeNode build(int[] nodes) {

    SearchInBinarySearchTree_Problem700.TreeNode tree = null;

    for (int node : nodes) {
      if(tree == null) {
        tree = new SearchInBinarySearchTree_Problem700.TreeNode(node);
      } else {
        tree.insert(node);
      }
    }

    return tree;

  }

  
}