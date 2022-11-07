package com.zyl.leetcode;

public class _85 {

    public static void main(String[] args) {
        int[] heights = new int[]{2,1,5,6,2,3};

        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};

        int  res =maximalRectangle(matrix);
        System.out.println(res);
    }

    public static int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0 || matrix == null){
            return 0;
        }

        int res = 0;

        int[] heights = new int[matrix[0].length];

        for(int i = 0;i<matrix.length;i++){

            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    heights[j]++;
                }else{
                    heights[j]=0;
                }
            }
            res = Math.max(res,_84.largestRectangleArea(heights));
        }
        return res;
    }
}
