package com.zyl.leetcode;

public class _88mergeArray {

    // 双指针
    public static void mergeArray(int[] nums1,int m,int[] nums2,int n){
        // 定义一个临时数组
        int[] temp = new int[m+n];
        // 数组1的指针
        int index1 = 0;
        // 数组2的指针
        int index2 = 0;
        // 遍历数组1
        for(int i = 0;i<nums1.length;i++){
            //  数组1已经取完了
            if(index1>=m){
                temp[i] = nums2[index2++];
            }else if(index2>=n){
                temp[i] = nums1[index1++];
            }
            // 比较数组1小于等于数组2,取数组1的值
            else if(nums1[index1]<=nums2[index2]){
                temp[i] = nums1[index1];
                //数组1的指针往前移动1
                index1++;
            }else if(nums1[index1]>nums2[index2]){
                temp[i] = nums2[index2];
                //数组2的指针往前移动1
                index2++;
            }
        }

        for(int i = 0;i<temp.length;i++){
            nums1[i] = temp[i];
        }
    }


    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3, 0, 0,0};
        int[] nums2 = new int[]{2, 5, 6};
        mergeArray(nums1,3,nums2,3);
        for(int i = 0;i<nums1.length;i++){
           System.out.println(nums1[i]);
        }
    }

}
