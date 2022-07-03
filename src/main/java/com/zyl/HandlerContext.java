package com.zyl;

public class HandlerContext {

    private Handler handler;

    public HandlerContext next;//下一个context的引用

    public void setNext(HandlerContext next) {
        this.next = next;
    }

    public HandlerContext(Handler handler) {
        this.handler = handler;
    }

    public void handler(Object msg) {
        this.handler.doHandler(this,msg);
    }

    public void getNext(Object msg){
        if (this.next != null) {
            this.next.handler(msg);
        }
    }

}