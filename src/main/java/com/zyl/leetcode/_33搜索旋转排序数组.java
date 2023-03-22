package com.zyl.leetcode;

// [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为
// [4,5,6,7,0,1,2] 。
// 给你 旋转后 的数组 nums 和一个整数 target ，
// 如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
public class _33搜索旋转排序数组 {

    public static void main(String[] args) {
        int[] nums =  new int[]{3,1};
        int target = 0;
        System.out.println(search(nums,target));
    }

    public static  int search(int[] nums, int target) {
       if(nums.length == 0)
           return -1;

       int left = 0,right = nums.length-1;

       while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<=nums[right]){
                if(nums[mid]<target&&target<=nums[right]){
                     left=left+1;
                }else{
                     right = mid -1;
                }
            }else if(nums[mid]>=nums[left]){
                if(nums[left]<=target&&target<nums[mid]){
                    right = right-1;
                }else{
                    left = mid+1;
                }
            }
       }

       return -1;

    }
}
