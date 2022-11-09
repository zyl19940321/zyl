package com.zyl.leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。
// 请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]]
// （若两个四元组元素一一对应，则认为两个四元组重复）：

public class _18fourSum {

    public static void main(String[] args) {

         int[] nums =  new int[]{1000000000,1000000000,1000000000,1000000000};
         int target = -294967296;
         List<List<Integer>> res = fourSum(nums,target);

         for (List<Integer> list:res){
             System.out.println(list);
         }

    }


    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();

        if(nums.length<=0){
            return res;
        }

        Arrays.sort(nums);

        for(int i = 0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }

                 int left = j+1;
                 int right = nums.length-1;
                 while(left<right){
                     long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
                     if(sum< target){
                         left++;
                     }
                     else if(sum>target){
                         right--;
                     }else if(sum == target){
                        List<Integer> result = new ArrayList<>();
                         result.add(nums[i]);
                         result.add(nums[j]);
                         result.add(nums[left]);
                         result.add(nums[right]);
                         res.add(result);
                         while (left<right&&nums[left]==nums[left+1]){
                             left++;
                         }
                         while (left<right&&nums[right]==nums[right-1]){
                             right--;
                         }
                         left++;
                         right--;
                     }
                 }
            }
        }
        return res;
    }
}
