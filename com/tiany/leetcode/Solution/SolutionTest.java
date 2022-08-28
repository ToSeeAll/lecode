package com.tiany.leetcode.Solution;

import org.junit.Test;

import com.tiany.leetcode.dataStructs.ListNode;
import com.tiany.leetcode.dataStructs.TreeNode;
import com.tiany.leetcode.dataStructs.MinStack;

import java.io.IOException;

public class SolutionTest {

    @Test
    public void testFindRepeatNumber() throws IOException {
        Solution solution = new Solution();
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int a = solution.findRepeatNumber(nums);
        System.out.println(a);
    }

    @Test
    public void testFindNumberIn2DArray() {
        Solution solution = new Solution();
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 5;
        boolean a;
        a = solution.findNumberIn2DArray(matrix, target);
        System.out.println(a);
    }

    @Test
    public void testReplaceSpace() {
        Solution solution = new Solution();
        String s = "We are happy.";
        System.out.println(solution.replaceSpace(s));
    }

    @Test
    public void testFindNumberIn2DArray1() {
        System.out.println("aaa");
    }

    @Test
    public void testReversePrint() {
        ListNode listNode = new ListNode();
        ListNode listNode2 = new ListNode();
        // ListNode listNode3 = new ListNode();
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        listNode2 = listNode.createListNode(nums);
        Solution solution = new Solution();
        for (int i : solution.reversePrint(listNode2)) {
            System.out.println(i);// 最后一位是头指针的值，应舍去
        }

    }

    @Test
    public void testBuildTree() {
        Solution solution = new Solution();
        int[] a = {3, 9, 20, 15, 7};
        int[] b = {9, 3, 15, 20, 7};
        TreeNode root = new TreeNode();
        root = solution.buildTree(a, b);
        System.out.println(root);
    }

    @Test
    public void testFib() {
        Solution solution = new Solution();
        int a = 6;
        System.out.println(solution.fib(a));

    }

    @Test
    public void testMinSack() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());
    }

    @Test
    public void reverseList() {
        Solution solution = new Solution();
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        ListNode listNode = new ListNode();
        ListNode listNode3;
        ListNode listNode2 = new ListNode();
        listNode2 = listNode.createListNode(nums);
        listNode3 = solution.reverseList(listNode2);
        listNode3.printListNode();
    }

    @Test
    public void reverseLeftWords() {
        Solution solution = new Solution();
        String s = "adbsncs";
        int n = 2;
        System.out.println(solution.reverseLeftWords(s, n));
    }
}
