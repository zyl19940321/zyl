package com.zyl.leetcode;

import com.zyl.leetcode.common.ListNode;

import java.util.List;

public class _86分隔链表 {


    public static void main(String[] args){
        ListNode nodeA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(4);
        ListNode nodeA3 = new ListNode(3);
        ListNode nodeA4 = new ListNode(2);
        ListNode nodeA5 = new ListNode(5);
        ListNode nodeA6 = new ListNode(2);
        nodeA1.next  =(nodeA2);
        nodeA2.next  =(nodeA3);
        nodeA3.next  =(nodeA4);
        nodeA4.next  =(nodeA5);
        nodeA5.next = nodeA6;

        ListNode result = partition(nodeA1,3);

        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }


    public static ListNode partition(ListNode head, int x) {

        ListNode smallListNode = new ListNode();
        ListNode largerListNode = new ListNode();
        ListNode cur = head;
        ListNode small = smallListNode;
        ListNode larger = largerListNode;

        while (cur!=null){
            if (cur.val<x){
                small.next = cur;
                small = small.next;
            }else{
                larger.next = cur;
                larger =larger.next;
            }
            cur = cur.next;
        }

        larger.next = null;
        small.next = largerListNode.next;

        return smallListNode.next;
    }
}
