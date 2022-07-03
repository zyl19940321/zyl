package com.zyl.leetcode;

import java.util.ArrayList;
import java.util.List;

//输入：digits = "23"
//输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
public class _17letterCombinations {

   static String[] map = new String[]{"","","abc","def","ghi","jkl","mno","pqrs",
            "tuv","wxyz"};

    static List<String> res = new ArrayList<>();


    public static List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return res;
        }

        dfs(digits,0,"");
        return res;
    }

    static void dfs(String digits,int index,String s){
         if(digits.length()==index){
             res.add(s);
             return;
         }
         // 取出字符串中的数字 2
         Character c = digits.charAt(index);
         // 取出数字映射的字母串
         String letters = map[c - '0'];

         for(int i=0;i<letters.length();i++){
             dfs(digits,index+1,s+letters.charAt(i));
         }

         return;

    }

    public static void main(String[] args) {

        List<String> s =letterCombinations("23");
        for(String ss:s){
            System.out.println(ss);
        }
    }
}
