package com.tiany.leetcode.dataStructs;

import java.util.Deque;
import java.util.LinkedList;;

public class MinStack {

    /**
     * 对于栈来说，如果一个元素 a 在入栈时，栈里有其它的元素 b, c, d，那么无论这个栈在之后经历了什么操作，只要 a 在栈中，b, c, d
     * 就一定在栈中，因为在 a 被弹出之前，b, c, d 不会被弹出。
     * 因此，在操作过程中的任意一个时刻，只要栈顶的元素是 a，那么我们就可以确定栈里面现在的元素一定是 a, b, c, d。
     * 那么，我们可以在每个元素 a 入栈时把当前栈的最小值 m 存储起来。在这之后无论何时，如果栈顶元素是 a，我们就可以直接返回存储的最小值 m
     *
     * 作者：LeetCode-Solution
     * 链接：https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/solution/bao-han-minhan-shu-de-zhan-by-leetcode-s-i2fk/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */

    Deque<Integer> xStack;// 双端队列，用于记录主栈
    Deque<Integer> minStack;// 复制队列，用于记录最小值

    /** initialize your data structure here. */
    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);

    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(x, minStack.peek()));// 小数入栈

    }

    public void pop() {
        xStack.pop();
        minStack.pop();

    }

    public int top() {
        return xStack.peek();

    }

    public int min() {
        return minStack.peek();

    }
}

/*
  Your MinStack object will be instantiated and called as such:
  MinStack obj = new MinStack();
  obj.push(x);
  obj.pop();
  int param_3 = obj.top();
  int param_4 = obj.min();
 */