//package com.zyl.leetcode;
//
//import com.zyl.leetcode.common.ListNode;
//
//// 相交链表
//public class _160getIntersectionNode {
//
//    //快慢双指针
//    public static ListNode getIntersectionNode(ListNode head1, ListNode head2) {
//        // 一个指针指向链表1
//        ListNode fast = head1;
//        // 一个指针指向链表2
//        ListNode slow = head2;
//
//        // 只要两个指针不相等，就一直比较，
//        // 这里假设链表1比链表2短，那么fast指针肯定比slow更快的
//        // 移动完，当fast指向null的时候，让fast再从链表2开始遍历
//        // ,当slow在链表2遍历完后，也从链表1重新遍历，
//        // 如果两个链表相交，一定在某个结点相等，否则一定会同时指向null
//        while (fast != slow) {
//            fast = fast == null ? head2 : fast.next;
//            slow = slow == null ? head1 : slow.next;
//        }
//        return slow;
//    }
//
//    public static void main(String[] args) {
//        ListNode nodeA1 = new ListNode(4);
//        ListNode nodeA2 = new ListNode(1);
//        ListNode nodeA3 = new ListNode(8);
//        ListNode nodeA4 = new ListNode(4);
//        ListNode nodeA5 = new ListNode(5);
//        nodeA1.setNext(nodeA2);
//        nodeA2.setNext(nodeA3);
//        nodeA3.setNext(nodeA4);
//        nodeA4.setNext(nodeA5);
//
//        ListNode nodeB1 = new ListNode(5);
//        ListNode nodeB2 = new ListNode(6);
//        ListNode nodeB3 = new ListNode(1);
//
//        nodeB1.setNext(nodeB2);
//        nodeB2.setNext(nodeB3);
//        nodeB3.setNext(nodeA3);
//
//        ListNode result = getIntersectionNode(nodeA1, nodeB1);
//
//        while (result != null) {
//            System.out.println(result.value);
//            result = result.next;
//        }
//
//    }
//
//
//}
