package com.zyl;

public class Main {

    public static void main(String[] args) {

        MyPipeline pipeline =new MyPipeline();

        pipeline.addHandler(new FileParseHandler());//添加handler2
        pipeline.addHandler(new CheckerHandler());//添加handler1

      //  ExecutorService executor = Executors.newCachedThreadPool();//线程池

        pipeline.Request("hello" +1);

//        executor.submit(new Runnable() {

//            @Override

//            public void run() {

//                //提交多个任务

//                pipeline.Request("hello" + 1);

//            }

//        });

    }

}