package com.zyl.leetcode;

import java.util.Arrays;

/*给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
子序列 是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
输入：nums = [10,9,2,5,3,7,101,18]
输出：4
解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
进阶：
你能将算法的时间复杂度降低到 O(n log(n)) 吗?
*/
public class _300lengthOfLIS {

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int res = 0;
        // nums = [4,10,4,3,8,9]
        for (int i = 0; i < nums.length; i++) {
            // 找一下i的左边比i小的数的最大dp值
            for (int j = 0; j < i; j++) {
                // 假如这个数小于i位置上的数
                if (nums[j] < nums[i]) {
                    // 找到比i小的数里面最大的那个dp值
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }


    public static void main(String[] args) {
        //  1 2  1 1 2
        int[] nums1 = new int[]{4, 10, 4, 3, 8, 9};
        int res = lengthOfLIS(nums1);
        System.out.println(res);
    }

}
