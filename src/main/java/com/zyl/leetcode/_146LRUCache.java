package com.zyl.leetcode;

import java.util.HashMap;
import java.util.Map;

class _146LRUCache {

    Map<Integer, DoubleListNode> cache = new HashMap<>();
    private int size;
    private int cap;
    private DoubleListNode head;
    private DoubleListNode tail;

    public _146LRUCache(int cap) {
        this.size = 0;
        this.cap = cap;
        head = new DoubleListNode();
        tail = new DoubleListNode();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        DoubleListNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DoubleListNode node = cache.get(key);
        if (node == null) {
            DoubleListNode newNode = new DoubleListNode(key, value);
            addToHead(newNode);
            cache.put(key, newNode);
            ++size;
            if (size > cap) {
                DoubleListNode tail = removeTail();
                cache.remove(tail.key);
                --size;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

      // A   B   C null
    public void addToHead(DoubleListNode node) {
        // 新加入的节点前面指向伪头部节点
        node.pre = head;
        // 新加入的节点后面指向伪头部节点的后面
        node.next= head.next;
        // 原来的真正头部的前面指向新加入的
        head.next.pre = node;
        head.next = node;
    }

    public void remove(DoubleListNode node) {
        node.next.pre = node.pre;
        node.pre.next = node.next;
    }

    public void moveToHead(DoubleListNode node) {
        remove(node);
        addToHead(node);
    }

    public DoubleListNode removeTail(){
       DoubleListNode res = tail.pre;
       remove(res);
       return res;
    }

}

class DoubleListNode {


    public DoubleListNode() {
    }

    public DoubleListNode(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public DoubleListNode pre;

    public DoubleListNode next;

    public int key;

    public int value;

}
