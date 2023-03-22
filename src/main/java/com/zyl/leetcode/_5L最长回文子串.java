package com.zyl.leetcode;

public class _5L最长回文子串 {

    public static void main(String[] args) {
        String ss = "babad";
        String res = longestPalindrome(ss);
        System.out.println(res);
    }

    public static String longestPalindrome(String s) {
        int maxLength = 0;
        String maxString = "";
        int length = s.length();

        boolean[][] dp = new boolean[length][length];

        // 外层循环len是字符串长度,第一次遍历字符串长度为1的子串
        // 第二次遍历字符串长度为2的子串
        for (int len = 1; len <= length; len++) {
            // 字符串开始的下标
            for (int start = 0; start < length; start++) {
                //拿到本次要计算的字符串的结束位置
                int end = start + len - 1;
                if (end >= length) {
                    break;
                }
                dp[start][end] = (end - start <= 2 || dp[start + 1][end - 1]) && s.charAt(start) == s.charAt(end);
                if (dp[start][end] && len > maxLength) {
                    maxString = s.substring(start, end + 1);
                }
            }
        }
        return maxString;
    }



    public static String longestPalindrome2(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int strLen = s.length();
        int maxStart = 0;  //最长回文串的起点
        int maxEnd = 0;    //最长回文串的终点
        int maxLen = 1;  //最长回文串的长度

        boolean[][] dp = new boolean[strLen][strLen];

        for (int r = 1; r < strLen; r++) {
            for (int l = 0; l < r; l++) {
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        maxStart = l;
                        maxEnd = r;

                    }
                }

            }

        }
        return s.substring(maxStart, maxEnd + 1);

    }


}