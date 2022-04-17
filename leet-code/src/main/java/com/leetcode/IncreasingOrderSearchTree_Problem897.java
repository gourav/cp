package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
 * Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
 * Example 2:
 * <p>
 * <p>
 * Input: root = [5,1,7]
 * Output: [1,null,5,null,7]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the given tree will be in the range [1, 100].
 * 0 <= Node.val <= 1000
 */
public class IncreasingOrderSearchTree_Problem897 {

  public TreeNode increasingBST(TreeNode node) {

    List<Integer> list = new ArrayList<>();
    visitAndCollect(node, list);

    if(list.isEmpty() || list.size() == 1) {
      return node;
    }

    TreeNode root = new TreeNode(list.get(0));
    for (int i = 1; i < list.size(); i++) {
      build(root, list.get(i));
    }

    return root;

  }

  private void visitAndCollect(TreeNode node, List<Integer> list) {

    if(node == null) {
      return;
    }

    visitAndCollect(node.left, list);
    list.add(node.val);
    visitAndCollect(node.right, list);
  }

  static void build(TreeNode root, int val) {

    if(val < root.val) {

      if(root.left == null) {
        root.left = new TreeNode(val);
      } else {
        build(root.left, val);
      }

    } else {

      if(root.right == null) {
        root.right = new TreeNode(val);
      } else {
        build(root.right, val);
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

    @Override
    public String toString() {
      return "TreeNode{" +
        "val=" + val +
        ", left=" + left +
        ", right=" + right +
        '}';
    }
  }

}
