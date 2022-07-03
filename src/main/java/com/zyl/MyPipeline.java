package com.zyl;

public class MyPipeline {

    private HandlerContext head;

    public MyPipeline() {
        head = new HandlerContext(new Handler() {
            @Override
            public void doHandler(HandlerContext ctx, Object msg) {
                head.getNext(msg);
            }
        });
    }


    // 为执行链添加一个handler
    public void addHandler(Handler handler) {
        HandlerContext handlerContext = head;
        while (handlerContext.next!=null){
            handlerContext = handlerContext.next;
        }
        handlerContext.next = new HandlerContext(handler);
    }

    public void Request(Object msg) {//封装了外部调用接口

        this.head.handler(msg);

    }

//    final class HeadContext extends HandlerContext {//这是一个内部类，为默认handler的context

//

//        public HeadContext(Handler handler) {

//            super(handler);

//        }

//    }

//

//    final class HeadHandler implements Handler {//这是一个内部类，是pipeline的默认处理handler。

//

//        @Override

//        public void channelRead(HandlerContext ctx, Object msg) {

//            String result = (String) msg + "end";

//            System.out.println(result);

//        }

//    }


}