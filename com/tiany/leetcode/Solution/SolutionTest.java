package com.tiany.leetcode.Solution;

import org.junit.Test;
import java.io.IOException;

public class SolutionTest {

    @Test
    public void testFindRepeatNumber() throws IOException {
        Solution solution = new Solution();
        int[] nums = { 2, 3, 1, 0, 2, 5, 3 };
        int a = solution.findRepeatNumber(nums);
        System.out.println(a);
    }

    @Test
    public void testFindNumberIn2DArray() {
        Solution solution = new Solution();
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
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
}
