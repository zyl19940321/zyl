package com.zyl.leetcode;

import java.util.Stack;

public class _84 {

    public static void main(String[] args) {
        int[] heights = new int[]{2,1,5,6,2,3};
        int  res =largestRectangleArea(heights);
        System.out.println(res);
    }


    public static int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<Integer>();
        int res = 0;
        int[] newHeight = new int[heights.length+2];

        newHeight[0] = 0;
        newHeight[heights.length+1] = 0;

        for(int i = 1; i<newHeight.length-1;i++){
            newHeight[i]  = heights[i-1];
        }

        for(int i=0;i<newHeight.length;i++){
            while(!stack.empty()&&newHeight[i]<newHeight[stack.peek()]){
                int cur = stack.pop();
                int curHeight = newHeight[cur];

                int leftIndex = stack.peek();
                int rightInde = i;

                int width = rightInde - leftIndex -1;

                res = Math.max(res,width*curHeight);
            }
            stack.push(i);
        }
        return res;
    }
}
