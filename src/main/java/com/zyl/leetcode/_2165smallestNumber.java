package com.zyl.leetcode;

import java.util.ArrayList;
import java.util.List;

//输入：num = 310
//解释：310 中各位数字的可行排列有：013、031、103、130、301、310 。
//不含任何前导零且值最小的重排数字是 103 。
//输出：103
public class _2165smallestNumber {

    static List<String> res = new ArrayList<>();

    public static List<String> smallestNumber(String num) {

        dfs(num,0,"");
        return res;
    }

    static void dfs(String num,int index,String s){

        if(num.length()==index){
             res.add(s);
             return;
         }

        for(int i=index;i<num.length();i++){
            Character c = num.charAt(index);
            dfs(num,index+1,s+String.valueOf(c));
        }
    }

    public static void main(String[] args) {

        List<String> s =smallestNumber("31");
        for(String ss:s){
            System.out.println(ss);
        }
    }

}
