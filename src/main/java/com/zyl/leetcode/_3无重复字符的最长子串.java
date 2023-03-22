package com.zyl.leetcode;

import java.util.HashMap;

public class _3无重复字符的最长子串 {

    public static int lengthofLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        //定义一个map，存的是每个字符最后一次出现的下标
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            //遇到重复字符串的时候
            if (map.containsKey(s.charAt(i))) {
                //"asddvv1"也就是遇到d的时候，我直接移动到第一次d下一个下标
                //第一次d的下标是3，那么left就移动到4去，后面只需要计算i-left后和当前的max进行比较
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}