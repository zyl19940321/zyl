package com.zyl.leetcode;

import com.zyl.leetcode.common.ListNode;

public class _25K个一组翻转链表 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode cur = head;
        int i = k;
        //找到要反转的子链表的最后一个节点
        while (i - 1 > 0) {
            cur = cur.next;
            if (cur == null) {
                return head;
            }
            i--;
        }
        // 保存子链表的后续链表
        ListNode tmp2 = cur.next;
        cur.next = null;
        // 反转拿到的子链表
        ListNode new_head = fanzhuan(head);
        head.next = reverseKGroup(tmp2, k);
        return new_head;
    }

    public ListNode fanzhuan(ListNode head) {
        ListNode current_head = null;

        while (head != null) {

            ListNode next = head.next;

            head.next = current_head;

            current_head = head;

            head = next;

        }
        return current_head;
    }
}

