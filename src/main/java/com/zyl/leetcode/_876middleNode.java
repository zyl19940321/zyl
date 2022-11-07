package com.zyl.leetcode;

import com.zyl.leetcode.common.ListNode;

// 链表的中间结点
public class _876middleNode {


    //快慢双指针
    public static ListNode middle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args){
        ListNode nodeA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(1);
        ListNode nodeA3 = new ListNode(2);
        ListNode nodeA4 = new ListNode(3);
        ListNode nodeA5 = new ListNode(4);
        nodeA1.next  =(nodeA2);
        nodeA2.next  =(nodeA3);
        nodeA3.next  =(nodeA4);
        nodeA4.next  =(nodeA5);

        ListNode nodeB1 = new ListNode(1);
        ListNode nodeB2 = new ListNode(2);
        ListNode nodeB3 = new ListNode(3);
        ListNode nodeB4 = new ListNode(3);
        ListNode nodeB5 = new ListNode(3);
        ListNode nodeB6 = new ListNode(7);
        nodeB1.next  = nodeB2;
        nodeB2.next  = nodeB3;
        nodeB3.next  = nodeB4;
        nodeB4.next  = nodeB5;
        nodeB5.next  = nodeB6;

        ListNode result = middle(nodeB1);

        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }



    }

}
