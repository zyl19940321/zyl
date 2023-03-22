package com.zyl.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _76最小覆盖子串 {

    public static void main(String[] args) {
        String s = "ab";
        String t = "A";
        String res = minwindow(s, t);

        System.out.println(res);

    }

    public static String minwindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if (need.containsKey(c)) {
                need.put(c, need.get(c) + 1);
            } else {
                need.put(c, 1);
            }
        }
        int length = Integer.MAX_VALUE;
        int right = 0;
        int valid = 0;
        int left = 0;
        int start = 0;
        while (right < s.length()) {
            Character c = s.charAt(right);
            right++;
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (need.containsKey(c)) {
                if (need.get(c).equals(window.get(c))) {
                    valid++;
                }
            }

            while (valid == need.size()) {
                if (right - left < length) {
                    start = left;
                    length = right - left;
                }
                Character leftC = s.charAt(left);
                if (need.containsKey(leftC)) {
                    if (need.get(leftC).equals(window.get(leftC))) {
                        valid--;
                    }
                }
                window.put(leftC, window.get(leftC) - 1);
                if (window.get(leftC) == 0) {
                    window.remove(leftC);
                }
                left++;
            }
        }
        length = length == Integer.MAX_VALUE ? 0 : length;
        return s.substring(start, start + length);
    }
}