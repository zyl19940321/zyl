package com.zyl;

public class CheckerHandler extends Handler{

    @Override
    public void doHandler(HandlerContext ctx, Object msg) {

        System.out.println("券对账前置处理");
        System.out.println("券对账前置处理");
        System.out.println("券对账后续处理");

        String result = (String) msg +"-handler1";//在字符串后面加特定字符串
        System.out.println(result);
        ctx.getNext(result);//写入操作，这个操作是必须的，相当于将结果传递给下一个handler
    }
}