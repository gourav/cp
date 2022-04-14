package com.leetcode;

import java.util.Objects;

/**
 * You are given the root of a binary search tree (BST) and an integer val.
 * <p>
 * Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root = [4,2,7,1,3], val = 2
 * Output: [2,1,3]
 * Example 2:
 * <p>
 * <p>
 * Input: root = [4,2,7,1,3], val = 5
 * Output: []
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 5000].
 * 1 <= Node.val <= 10^7
 * root is a binary search tree.
 * 1 <= val <= 10^7
 */
public class SearchInBinarySearchTree_Problem700 {

  public TreeNode searchBST(TreeNode root, int val) {

    /*
     * Approach:
     * ==
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
     * Memory Usage: 42.8 MB, less than 83.73% of Java online submissions for Search in a Binary Search Tree.
     */
    if(root == null) {
      return null;
    } else if(root.val == val) {
      return root;
    } else if(root.val < val) {
      return searchBST(root.right, val);
    }

    return searchBST(root.left, val);

  }

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    void insert(int val) {

      if (val < this.val) {

        if(this.left == null) {
          this.left = new TreeNode(val);
        } else {
          this.left.insert(val);
        }

      } else {

        if(this.right == null) {
          this.right = new TreeNode(val);
        } else {
          this.right.insert(val);
        }

      }

    }

    @Override
    public String toString() {
      return "TreeNode{" +
        "val=" + val +
        ", left=" + left +
        ", right=" + right +
        '}';
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      TreeNode treeNode = (TreeNode) o;

      if (val != treeNode.val) return false;
      if (!Objects.equals(left, treeNode.left)) return false;
      return Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
      int result = val;
      result = 31 * result + (left != null ? left.hashCode() : 0);
      result = 31 * result + (right != null ? right.hashCode() : 0);
      return result;
    }
  }



}
