package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 * Example 2:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [1, 100].
 * 1 <= Node.val <= 100
 */
public class MiddleOfTheLinkedList_Problem876 {

  public ListNode middleNode(ListNode head) {

    /*
     * Approach One;
     * ==
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
     * Memory Usage: 42.3 MB, less than 11.94% of Java online submissions for Middle of the Linked List.
     *
    List<ListNode> list = new ArrayList<>();
    ListNode node = head;
    while (node != null) {
      list.add(node);
      node = node.next;
    }

    int size = list.size();
    return list.get(size / 2);*/

    ListNode fast = head, slow = fast;

    /*
     * Approach Two:
     * ===
     * Two pointers, one pointer which moves with 1x speed and another one with 2x speed.
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
     * Memory Usage: 40.1 MB, less than 80.11% of Java online submissions for Middle of the
     */
    while(fast!= null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    return slow;

  }

  static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      ListNode listNode = (ListNode) o;

      if (val != listNode.val) return false;
      return next != null ? next.equals(listNode.next) : listNode.next == null;
    }

    @Override
    public int hashCode() {
      int result = val;
      result = 31 * result + (next != null ? next.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "ListNode{" +
        "val=" + val +
        ", next=" + next +
        '}';
    }
  }

}
