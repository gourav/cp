package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfTheLinkedList_Problem876Test {

  @Test
  void shouldReturnLinkedListOfThreeFourFive_whenInputIsOneTwoThreeFourFive() {

    MiddleOfTheLinkedList_Problem876 sut = new MiddleOfTheLinkedList_Problem876();
    assertEquals(build(new int[]{3, 4, 5}), sut.middleNode(build(new int[]{1, 2, 3, 4, 5})));

  }

  @Test
  void shouldReturnLinkedListOfFourFiveSix_whenInputIsOneTwoThreeFourFiveSix() {

    MiddleOfTheLinkedList_Problem876 sut = new MiddleOfTheLinkedList_Problem876();
    assertEquals(build(new int[]{4, 5, 6}), sut.middleNode(build(new int[]{1, 2, 3, 4, 5, 6})));

  }

  @Test
  void shoudlReturnOne_whenInputIsOne() {

    MiddleOfTheLinkedList_Problem876 sut = new MiddleOfTheLinkedList_Problem876();
    assertEquals(build(new int[]{1}), sut.middleNode(build(new int[]{1})));

  }

  @Test
  void shouldReturnOneTwo_whenInputIsOneTwo() {

    MiddleOfTheLinkedList_Problem876 sut = new MiddleOfTheLinkedList_Problem876();
    assertEquals(build(new int[]{2}), sut.middleNode(build(new int[]{1, 2})));

  }

  private MiddleOfTheLinkedList_Problem876.ListNode build(int[] array) {

    MiddleOfTheLinkedList_Problem876.ListNode head = new MiddleOfTheLinkedList_Problem876.ListNode(array[0]);
    MiddleOfTheLinkedList_Problem876.ListNode node = head;

    for (int i = 1; i < array.length; i++) {
      node.next = new MiddleOfTheLinkedList_Problem876.ListNode(array[i]);
      node = node.next;
    }

    return head;

  }


}