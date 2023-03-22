package com.zyl.leetcode;
//给定一个长度为 n 的整数数组 height。有n条垂线，第 i 条线的两个端点是(i, 0)和(i, height[i]) 。
//找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//
//        返回容器可以储存的最大水量。
//输入：[1,8,6,2,5,4,8,3,7]
//输出：49
//
public class _11盛最多水的容器 {

    public static int maxArea(int[] height) {
        int area = 0;

        if(height.length==0){
            return area;
        }

        int left = 0;
        int right = height.length-1;


        while (left<right){
            // 计算面积,高度是长度小的一边决定
            int h = 0;
            if(height[left]<=height[right]){
                 h = height[left];
                 int nowArea =  (h * (right-left));
                 area = nowArea > area ? nowArea:area;
                 left++;
            }else{
                 h = height[right];
                 int nowArea =  (h * (right-left));
                 area = nowArea > area ? nowArea:area;
                 right--;
            }
        }

        return area;
    }


    public static void main(String[] args) {

        int[] nums1 = new int[]{1,8,6,2,5,4,8,3,7};
        int res = maxArea(nums1);
        System.out.println(res);
    }
}
