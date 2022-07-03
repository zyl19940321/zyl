package com.zyl.classloader;

import com.zyl.Deg.ParseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ParseRoute {

    static Map<String, Consumer<String>> parseStrageMap = new HashMap<>();

    static  ParseImpl parse = new ParseImpl();

    static {
        parseStrageMap.put("success",(per)->parse.fileSuccess(per));
        parseStrageMap.put("fail",(per)->parse.fileFail(per));
    }

    public static void  getParse(String key){
        Consumer res = parseStrageMap.get(key);
        res.accept(key);
    }

}


