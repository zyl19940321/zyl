package com.zyl.leetcode;

import java.util.ArrayList;
import java.util.List;

//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
public class _22括号生成 {

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(0, 0, 3,"", res);
        return res;
    }

    public static void dfs(int leftCount, int rightCount, int n,String s,List<String> res) {

        if (leftCount == n && rightCount == n) {
            res.add(s);
            return;
        }

        // 左括号的数量小于 n ,生成一个左括号
        if (leftCount < n) {
           // System.out.println(seq.toString());
            dfs(leftCount + 1, rightCount, n, s+"(", res);
        }
        if (rightCount < n && rightCount < leftCount) {
          //  System.out.println(seq.toString());
            dfs(leftCount,rightCount + 1, n, s+")", res);
        }
    }

    public static void main(String[] args) {

        List<String> res = generateParenthesis(3);
        for (String s : res) {
            System.out.println(s);
        }

    }
}
