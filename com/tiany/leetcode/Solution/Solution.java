package com.tiany.leetcode.Solution;

import java.util.ArrayList;
import java.util.Arrays;

import com.tiany.leetcode.dataStructs.ListNode;
import com.tiany.leetcode.dataStructs.RandomNode;
import com.tiany.leetcode.dataStructs.TreeNode;

public class Solution {
    public Solution() {
    }

    /**
     * 找出数组中重复的数字。
     * <p>
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1
     * 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：<a href="https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof">找出数组中重复的数字</a>
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int findRepeatNumber(int[] nums) {

        int a = -1;
        for (int i = 0; i < nums.length; i++) {
            if (a == -1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        a = nums[i];
                        break;
                    }
                }
            } else
                break;
        }
        return a;
    }

    /**
     * 在一个 n * m
     * 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，
     * 判断数组中是否含有该整数
     * 示例:
     * 现有矩阵 matrix 如下：
     * [
     * [1, 4, 7, 11, 15],
     * [2, 5, 8, 12, 19],
     * [3, 6, 9, 16, 22],
     * [10, 13, 14, 17, 24],
     * [18, 21, 23, 26, 30]
     * ]
     * 给定 target=5，返回true
     * 给定 target=20，返回false
     * *
     * 来源：力扣（LeetCode）
     * 链接：<a href="https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof">判断数组中是否存在某个数字</a>
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @return boolean
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"
     * 输入：s = "We are happy."
     * 输出："We%20are%20happy."
     */
    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {

        ListNode p = head;
        int count = 0;
        while (head != null) {
            count++;
            head = head.getNext();
        }
        int[] a = new int[count];
        count--;
        // System.out.println(count);
        while (p != null) {
            a[count] = p.getVal();
            count--;
            p = p.getNext();

        }

        return a;
    }

    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
     * <p>
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     *
     * @param preorder
     * @param inorder
     * @return TreeNode
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        // 1、根据前序，找到根的值，并且创建根节点
        int rootValue = preorder[0];
        TreeNode root = new TreeNode(rootValue);

        // 2、在中序中找到根的值所在的下标
        int leftSize = find(inorder, rootValue);

        // 3、切出左子树的前序和中序
        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, 1 + leftSize);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, leftSize);
        root.setLeft(buildTree(leftPreorder, leftInorder));

        // 4、切出右子树的前序和中序
        int[] rightPreorder = Arrays.copyOfRange(preorder, 1 + leftSize, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, leftSize + 1, preorder.length);
        root.setRight(buildTree(rightPreorder, rightInorder));

        return root;
    }

    /**
     * 在中序中找到根的值所在的下标
     *
     * @param array
     * @param v
     * @return
     */
    private static int find(int[] array, int v) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == v) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
     * <p>
     * F(0) = 0,F(1)= 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
     * <p>
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：<a href="https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof">求斐波那契数列的第n项</a>
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }


    /**
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
     */
    public ListNode reverseList(ListNode head) {
//        int count = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        //todo 应该增加空串的处理？
        ListNode pnode, hnode = new ListNode();
        pnode = hnode;
        while (head.getNext() != null) {

            head = head.getNext();
            a.add(head.getVal());
        }
        int count = a.size() - 1;
        while (count >= 0) {
            ListNode next = new ListNode(a.get(count));
            pnode.setNext(next);
            pnode = pnode.getNext();
            count--;
        }
        return hnode;

    }


    /**
     * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
     * 来源：力扣（LeetCode）
     * 链接：<a href="https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof">复制复杂链表</a>
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public RandomNode copyRandomList(RandomNode head) {
        RandomNode node = null, hnode;
        hnode = node;
        while (head.next != null) {
            RandomNode xnode = new RandomNode(head.val);
            xnode.random = head.random;
            xnode.next = head.next;
            hnode.next = xnode;
            hnode = hnode.next;
        }

        return node;
    }
}

