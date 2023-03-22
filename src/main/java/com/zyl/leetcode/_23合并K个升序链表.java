package com.zyl.leetcode;

import com.zyl.leetcode.common.ListNode;

public class _23合并K个升序链表 {

    public static void main(String[] args) {
        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(4);
        listNode11.next = listNode12;


        ListNode listNode21 = new ListNode(1);
        ListNode listNode22 = new ListNode(5);
        listNode21.next = listNode22;

        ListNode listNode31 = new ListNode(2);
        ListNode listNode32 = new ListNode(6);
        listNode31.next = listNode32;

        ListNode[] lists = new ListNode[]{
                listNode11, listNode21, listNode31
        };

        ListNode res = mergeKLists(lists);

        while (res.next != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        int min_index = 0;
        ListNode head = new ListNode(0);
        ListNode h = head;

        while (true) {
            boolean isBreak = true;//标记是否遍历完所有链表
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    //找出最小下标
                    if (lists[i].val < min) {
                        min_index = i;
                        min = lists[i].val;
                        //存在一个链表不为空，标记改完 false
                        isBreak = false;
                    }
                }
            }
            if (isBreak) {
                break;
            }
            //加到新链表中
            ListNode a = new ListNode(lists[min_index].val);
            h.next = a;
            h = h.next;
            //链表后移一个元素
            lists[min_index] = lists[min_index].next;
        }
        h.next = null;
        return head.next;
    }
}