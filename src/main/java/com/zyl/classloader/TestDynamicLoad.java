package com.zyl.classloader;

public class TestDynamicLoad {
    static {
        System.out.println("*************load TestDynamicLoad************");
    }

    public static void main(String[] args) {
        new A();
        System.out.println("*************load test************");

        B b = null; //B不会加载，除非这里执行 new B() 11 } 12 } 1314 class A { 15 static { 16 System.out.println("*************load A************"); 17 } 1819 public A() { 20 System.out.println("*************initial A************");
    }
}

class A {
    static {
        System.out.println("*************load A************");
    }

    public A() {
        System.out.println("*************initial A************");
    }
}

class B {
    static {
        System.out.println("*************load B************");
    }

    public B() {
        System.out.println("*************initial B************");

    }
}
