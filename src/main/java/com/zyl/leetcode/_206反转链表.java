package com.zyl.leetcode;

import com.zyl.leetcode.common.ListNode;

public class _206反转链表 {

    public static ListNode reverseList(ListNode head){

        // 定义指针指向当前结点
        ListNode cur = head;
        // 定义指针指向当前结点的前一个结点
        ListNode pre = null;
        // 遍历当前指针
        while (cur!=null){
             //先保存一下当前指针指向的下一个节点
            ListNode listNode = cur.next;
            // 当前结点的下一个结点 指向 pre所在的结点
            cur.next = pre;
            pre =cur;
            cur = listNode;
        }
        return pre;
    }
}
