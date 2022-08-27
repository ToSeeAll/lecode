package com.tiany.leetcode.dataStructs;

/**
 * 随机链表，链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 * */
public class RandomNode {
        public int val;
        public RandomNode next;
        public RandomNode random;

        public RandomNode(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
}
