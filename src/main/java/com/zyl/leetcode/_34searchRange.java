package com.zyl.leetcode;

import java.util.List;

//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4]
public class _34searchRange {

    public static int[] searchRange(int[] nums, int target) {

        int[] res = new int[2];

        if(nums.length == 0){
            res =  new int[]{-1,-1};
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + (right-left)/2 ;
            if(nums[mid] >= target) {
                right = mid;
            }else{
                left = mid+1;
            }
        }

        if(nums[left]!=target){
            res =  new int[]{-1,-1};
            return res;
        }
        res[0] = left;

        left = 0;
        right = nums.length - 1;
        while (left < right){
            int mid = left + (right-left)/2 +1;
            if(nums[mid] <= target) {
                left = mid;
            }else{
                right = mid-1;
            }
        }
        res[1] = right;
        return res;
    }

    public static void main(String[] args) {

        int[] nums =  new int[]{5,7,7,8,8,10};
        int[] res = searchRange(nums,6);
        for (int i : res) {
            System.out.println(i);
        }

    }
}
