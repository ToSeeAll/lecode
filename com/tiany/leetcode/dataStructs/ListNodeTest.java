package com.tiany.leetcode.dataStructs;

import org.junit.Test;

public class ListNodeTest {
    @Test
    public void testCreateListNode() {
        ListNode listNode = new ListNode();
        ListNode listNode2 = new ListNode();
        // ListNode listNode3 = new ListNode();
        int[] nums = { 2, 3, 1, 0, 2, 5, 3 };
        listNode2 = listNode.createListNode(nums);
        listNode2.printListNode();
        listNode2.printListNode();
    }
}
