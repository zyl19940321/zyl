package com.zyl.leetcode;

public class _209长度最小的子数组 {

    public static void main(String[] args) {

        int[] nums1 = new int[]{2,3,1,2,4,3};
        int res = minSubArrayLen(7,nums1);
        System.out.println(res);
    }

    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= s) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
