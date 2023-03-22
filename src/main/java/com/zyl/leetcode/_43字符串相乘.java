package com.zyl.leetcode;

// 输入: num1 = "123", num2 = "456"
// 输出: "56088"

public class _43字符串相乘 {

    public static void main(String[] args) {
        String num1 =  "19";
        String num2 = "19";

        System.out.println(multiply(num1,num2));
    }

    public static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        String res = "";

        for (int i = num2.length() - 1; i >= 0; i--) {
            StringBuffer stringBuffer = new StringBuffer();
            for(int j=num2.length() -1;j>i;j--){
                stringBuffer.append("0");
            }

            int n2 = num2.charAt(i) - '0';
            int add = 0;
            for (int j = num1.length()-1; j >= 0; j--) {
                int n1 = num1.charAt(j) - '0';
                int product = (n1 * n2) +add;
                stringBuffer.append(product%10);
                add = ((n1 * n2)) /10;
            }
            if(add!=0){
                stringBuffer.append(add%10);
            }
            res = addStrings(res,stringBuffer.reverse().toString());
        }

        return res;
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }

}
