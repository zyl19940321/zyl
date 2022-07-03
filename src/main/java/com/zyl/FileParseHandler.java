package com.zyl;

public class FileParseHandler extends Handler {

    @Override
    public void doHandler(HandlerContext ctx, Object msg) {

        System.out.println(Thread.currentThread().getName());
        System.out.println("文件解析前置处理");
        System.out.println("文件解析前置处理");
        System.out.println("文件解析后续处理");
        String result = (String) msg +"-handler2";
        System.out.println(result);
        ctx.getNext(result);
    }

}


