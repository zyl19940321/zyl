package com.zyl.leetcode;


import com.zyl.leetcode.common.ListNode;

// 合并两个有序的链表 [1,1,2,3,5]   [1,2,3,3,3,4,7]
public class MergeListNode {

    public static ListNode merge(ListNode ListNode1, ListNode ListNode2){

         if (ListNode1 == null) return ListNode2;
         if (ListNode2 == null) return ListNode1;

         ListNode result = new ListNode(0);
         //负责在结果链表上移动
         ListNode p = result;
         while (ListNode1!=null && ListNode2!=null){
             // 两个链表的节点值相等,取链表1的节点
             if(ListNode1.value <= ListNode2.value){
                 //链表1的节点写入结果节点的下一个节点
                 p.next = ListNode1;
                 //链表1的指针指向下一个节点
                 ListNode1 = ListNode1.next;
                 p = p.next;
                 continue;
             }
             //  链表1的值大于链表2的值，把链表2的节点放入结果链表中
             if(ListNode1.value>=ListNode2.value){
                 // 把链表2的节点放入结果链表中
                 p.next = ListNode2;
                 // 指针2指向下链表2的下一个节点
                 ListNode2 = ListNode2.next;
                 p = p.next;
                 continue;
             }

         }
         if(ListNode1!=null){
             p.next = ListNode1;
         }
         if(ListNode2!=null){
            p.next = ListNode2;
         }

         return result.next;
    }


    public static void main(String[] args) {
        ListNode nodeA1 = new ListNode(1);
        ListNode nodeA2 = new ListNode(1);
        ListNode nodeA3 = new ListNode(2);
        ListNode nodeA4 = new ListNode(3);
        ListNode nodeA5 = new ListNode(4);
        nodeA1.setNext(nodeA2);
        nodeA2.setNext(nodeA3);
        nodeA3.setNext(nodeA4);
        nodeA4.setNext(nodeA5);

        ListNode nodeB1 = new ListNode(1);
        ListNode nodeB2 = new ListNode(2);
        ListNode nodeB3 = new ListNode(3);
        ListNode nodeB4 = new ListNode(3);
        ListNode nodeB5 = new ListNode(3);
        ListNode nodeB6 = new ListNode(7);
        nodeB1.setNext(nodeB2);
        nodeB2.setNext(nodeB3);
        nodeB3.setNext(nodeB4);
        nodeB4.setNext(nodeB5);
        nodeB5.setNext(nodeB6);

        ListNode result = merge(nodeA1, nodeB1);

        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }

    }

}
