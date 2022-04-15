package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Given the root of a binary search tree and the lowest and highest boundaries as low and high, trim the tree so that all its elements lies in [low, high]. Trimming the tree should not change the relative structure of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant). It can be proven that there is a unique answer.
 * <p>
 * Return the root of the trimmed binary search tree. Note that the root may change depending on the given bounds.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root = [1,0,2], low = 1, high = 2
 * Output: [1,null,2]
 * Example 2:
 * <p>
 * <p>
 * Input: root = [3,0,4,null,2,null,null,1], low = 1, high = 3
 * Output: [3,2,null,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree in the range [1, 10^4].
 * 0 <= Node.val <= 10^4
 * The value of each node in the tree is unique.
 * root is guaranteed to be a valid binary search tree.
 * 0 <= low <= high <= 10^4
 */
public class TrimBinarySearchTree_Problem669 {

  public TreeNode trimBST(TreeNode root, int low, int high) {

    List<Integer> extracted = new ArrayList<>();
    extractAll(root, low, high, extracted);

    if(extracted.isEmpty()) {
      return null;
    }

    TreeNode newRoot = new TreeNode(extracted.get(0));
    for (int i = 1; i < extracted.size(); i++) {
      insert(newRoot, extracted.get(i));
    }

    return newRoot;

  }

  private void extractAll(TreeNode root, int low, int high, List<Integer> list) {

    if(root == null) {
      return;
    }

    if (low <= root.val && root.val <= high) {
      list.add(root.val);
    }

    extractAll(root.left, low, high, list);
    extractAll(root.right, low, high, list);

  }

  static void insert(TreeNode root, int val) {

    if (val < root.val) {

      if(root.left == null) {
        root.left = new TreeNode(val);
      } else {
        insert(root.left, val);
      }

    } else {

      if(root.right == null) {
        root.right = new TreeNode(val);
      } else {
        insert(root.right, val);
      }

    }

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
