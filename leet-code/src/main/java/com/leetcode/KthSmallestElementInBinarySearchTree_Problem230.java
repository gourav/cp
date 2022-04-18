package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root = [3,1,4,null,2], k = 1
 * Output: 1
 * Example 2:
 * <p>
 * <p>
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 * Output: 3
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is n.
 * 1 <= k <= n <= 104
 * 0 <= Node.val <= 104
 * <p>
 * <p>
 * Follow up: If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the kth smallest frequently, how would you optimize?
 */
public class KthSmallestElementInBinarySearchTree_Problem230 {

  private int element = -1;
  private int count = -1;

  public int kthSmallest(TreeNode root, int k) {

    /*
     * Approach One:
     * ===
     * Runtime: 1 ms, faster than 70.51% of Java online submissions for Kth Smallest Element in a BST.
     * Memory Usage: 43.1 MB, less than 78.38% of Java online submissions for Kth Smallest Element in a BST.
     *
    List<Integer> list = new ArrayList<>();
    visit(root, list);
    return list.get(k - 1); */

    /*
     * Approach Two:
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Kth Smallest Element in a BST.
     * Memory Usage: 42.1 MB, less than 91.65% of Java online submissions for Kth Smallest Element in a BST.
     */
    count = k;
    visit(root);
    return this.element;
  }

  private void visit(TreeNode node) {

    if(node == null) {
      return;
    }

    visit(node.left);
    --count;

    if(count == 0) {
      this.element = node.val;
      return;
    }

    visit(node.right);

  }

  private void visit(TreeNode node, List<Integer> list) {
    if(node == null) {
      return;
    }

    visit(node.left, list);
    list.add(node.val);
    visit(node.right, list);

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
          this.left = new KthSmallestElementInBinarySearchTree_Problem230.TreeNode(val);
        } else {
          this.left.insert(val);
        }

      } else {

        if(this.right == null) {
          this.right = new KthSmallestElementInBinarySearchTree_Problem230.TreeNode(val);
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

      KthSmallestElementInBinarySearchTree_Problem230.TreeNode treeNode = (KthSmallestElementInBinarySearchTree_Problem230.TreeNode) o;

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
