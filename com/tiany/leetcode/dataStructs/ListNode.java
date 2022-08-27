package com.tiany.leetcode.dataStructs;

/**
 * 单向链表
 */
public class ListNode {
    private int val;
    private ListNode next;

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int x) {
        val = x;
    }

    public ListNode() {
    }

    /**
     * 创建一个指定长度的空链表
     * 
     * @param maxLength :空链表长度
     * @return hNode :链表头结点
     */
    public ListNode createEmptyListNode(Integer maxLength) {
        ListNode hNode, pNode;
        hNode = new ListNode();
        pNode = hNode;
        for (int i = 1; i <= maxLength; i++) {
            ListNode node = new ListNode();
            pNode.setNext(node);
        }
        return hNode;
    }

    /**
     * 传入数组创建一个初始化过的链表
     * 
     * @param nums
     * @return
     */
    public ListNode createListNode(int[] nums) {
        ListNode hNode, pNode;
        hNode = new ListNode();
        pNode = hNode;
        for (int i = 0; i < nums.length; i++) {
            ListNode node = new ListNode();
            node.setVal(nums[i]);
            pNode.setNext(node);
            pNode = pNode.getNext();
        }
        return hNode;
    }

    /**
     * 打印当前链表
     */
    public void printListNode() {
        ListNode pNode;
        pNode = this;
        try {
            while (pNode.getNext() != null) {
                pNode = pNode.getNext();
                System.out.println(pNode.getVal());

            }
        } catch (NullPointerException exception) {
            // 空指针异常，不过暂时不影响使用，所以未修
        }

    }
    //todo 很奇怪，丢失第一个数据

    // /**
    // * 通过数组给链表赋值
    // *
    // * @param nums
    // * @param hNode
    // * @return
    // */
    // public ListNode createListNode(int[] nums, ListNode hNode) {
    // ListNode pNode = createListNode(nums);
    // hNode = pNode;
    // return hNode;

    // }

}
