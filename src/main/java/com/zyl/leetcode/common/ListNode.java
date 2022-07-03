package com.zyl.leetcode.common;

// 单向链表定义
public class ListNode {

    // 下一个节点
    public ListNode next;

    public Integer value;

    public ListNode(Integer value){
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
