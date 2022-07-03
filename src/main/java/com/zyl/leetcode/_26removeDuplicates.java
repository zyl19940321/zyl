package com.zyl.leetcode;

// 删除有序数组的重复数字，返回长度
//输入：nums = [0,0,1,1,1,2,2,3,3,4]
//输出：5, nums = [0,1,2,3,4]
public class _26removeDuplicates {

    public static int removeDuplicates(int[] nums){

        if(nums.length==0){
            return 0;
        }

        int j = 0;

        for(int i = 1;i<nums.length;i++){
            // 两个指针从头部开始，当
            if(nums[i]!=nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return ++j;
    }

    public static void main(String[] args) {

        int[] nums1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums1);
        System.out.println(res);
    }
}
