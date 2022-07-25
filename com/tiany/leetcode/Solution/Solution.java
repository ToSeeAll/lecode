package com.tiany.leetcode.Solution;

public class Solution {
    public Solution() {
    }

    /**
     * 找出数组中重复的数字。
     * 
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1
     * 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     * 
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
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
     * 给定 target = 5，返回 true
     * 给定 target = 20，返回 false
     * *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * 
     * @param matrix,targe
     * @return boolean
     * 
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
}