package com.zyl.leetcode;

import com.zyl.leetcode.common.ListNode;

public class _234isPalindrome {

         public boolean isPalindrome(ListNode head){

             ListNode fast = head,slow =head;
             while (fast!=null&&fast.next!=null){
                 fast = fast.next.next;
                 slow = slow.next;
             }

             if(fast!=null){
                 slow = slow.next;
             }

             slow = reverseList(slow);
             fast = head;

             while(slow!=null){
                 if(fast.value!=slow.value){
                     return false;
                 }
                 fast =fast.next;
                 slow =slow.next;
             }
             return true;
         }

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
