package com.zyl.leetcode;

// 打家劫舍
public class _198rob {

    // 数组[2,20,9,3,1] 输出：12 ，k为5-1=4
    // 递归的含义：num[k]我们取不取,取决 （K-2 + K） 和 K-1谁大
//    public static int rob(int[] nums,int k) {
//        if (nums == null|| k < 0){
//           return 0;
//        }
//        if(k == 0){
//            return nums[0];
//        }
//
//        return Math.max(rob(nums,k-1),rob(nums,k-2)+nums[k]);
//    }


    public static int rob(int[] nums) {
        int length = nums.length;
        if(nums==null||length==0){
            return 0;
        }
        if(length==1){
            return nums[0];
        }
        // 定义dp数组
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for(int i = 2;i<length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[length - 1];

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 7, 9, 3, 1};
        System.out.println(rob(nums1));
    }

}
