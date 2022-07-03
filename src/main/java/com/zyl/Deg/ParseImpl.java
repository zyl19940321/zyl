package com.zyl.Deg;

import com.zyl.classloader.ParseRoute;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ParseImpl {

    public static void main(String[] args){
        ParseRoute.getParse("fail");
    }

    public void fileSuccess(String s){
        System.out.println("success");
    }

    public void fileFail(String s){
        System.out.println("fail");
    }
}
