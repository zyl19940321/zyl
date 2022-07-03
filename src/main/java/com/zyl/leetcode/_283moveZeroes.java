package com.zyl.leetcode;

import com.zyl.leetcode.common.ListNode;

// 移动0
//输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]
public class _283moveZeroes {

    //快慢双指针
    public static int[] moveZeroes(int[] nums) {
        // 在数组上定义2个指针,i负责
        int i = 0;
        int j = 0;

        // 指针i负责遍历数组，
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // 把这个位置的数字放到j现在的位置
                nums[j] = nums[i];
                // j往后移动一位
                j++;
            }
        }

        // 把剩下j后面的数组全部变成0
        for (int m = j; m < nums.length; m++) {
            nums[m] = 0;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        nums = moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
