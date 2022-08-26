package com.tiany.leetcode.dataStructs;

import java.util.LinkedList;

class CQueue {

    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();

    }

    public void appendTail(int value) {
        stack1.addLast(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.removeLast();
        }
        if(stack1.isEmpty()){
            return -1;
        }
        while (!stack1.isEmpty()) {
            stack2.addLast(stack1.removeLast());
        }
        return stack2.removeLast();

    }
}