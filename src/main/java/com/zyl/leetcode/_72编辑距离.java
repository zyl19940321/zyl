package com.zyl.leetcode;

//输入：word1 = "intention", word2 = "execution"
// 输出：5
// 解释：
// intention -> inention (删除 't')
// inention -> enention (将 'i' 替换为 'e')
// enention -> exention (将 'n' 替换为 'x')
// exention -> exection (将 'n' 替换为 'c')
// exection -> execution (插入 'u')
public class _72编辑距离 {

    public static void main(String[] args){
       String word1 = "in";
       String word2 = "ie";

       System.out.println(minDistance(word1,word2));

    }

    public static int minDistance(String word1, String word2) {

        int l1 = word1.length();
        int l2 = word2.length();

        int[][] d = new int[l1+1][l2+1];

        for (int i = 0; i <= l1; i++) {
            d[i][0] = i;
        }

        for (int j = 0; j <= l2; j++) {
            d[0][j] = j;
        }

        for(int i = 1; i <= l1; i++){
            for (int j = 1; j <= l2; j++){
                d[i][j] = Math.min(d[i][j-1]+1,d[i-1][j]+1);
                if(word1.charAt(i-1)!=word2.charAt(j-1)){
                    d[i][j] = Math.min(d[i][j],d[i-1][j-1]+1);
                }else{
                    d[i][j] = Math.min(d[i][j],d[i-1][j-1]);
                }
            }
        }
        return d[l1][l2];
    }

}


