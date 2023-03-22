package com.zyl.leetcode;

public class _o42 {

    /**
     * 题目：剑指 Offer 42. 连续子数组的最大和
     * 链接：https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
     * 思路：动态规划 + 滚动数组
     * 状态转移方程：f(n) = max(f(n - 1) + num[i], num[i])
     * 边界条件：f(0) = num[0]
     * <p>
     * 如果当前元素加入到元素和 > 当前元素，则将当前元素加入到前面的元素和，否则只取当前元素
     * 使用一个变量记录最大和
     */

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int dp = nums[0];
        int max = dp;
        for (int i = 1; i < n; i++) {
            dp = Math.max(dp + nums[i], nums[i]);
            max = Math.max(max, dp);
        }
        return max;
    }

}
