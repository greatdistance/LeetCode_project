package edu.xufe.leetcode.demo;

public class Demo009 {

    public static void main(String[] args) {
        int x = 1221;
        int y = -121;
        int z = 10;
        int z1 = 124;

        Solution009 solution = new Solution009();
        System.out.println(solution.isPalindrome(x));
        System.out.println(solution.isPalindrome(y));

        System.out.println(solution.isPalindrome(z));
        System.out.println(solution.isPalindrome(z1));


    }

}

/*class Solution9 {
    public boolean isPalindrome(int x) {
        boolean flag = false;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x);
        String str1= stringBuilder.toString();
        stringBuilder.reverse();
        String str2 = stringBuilder.toString();
        if (str1.equals(str2)){
            flag = true;
        }
        return flag;
    }
}*/
/*

class Solution9 {
    public boolean isPalindrome(int x) {
        // 处理特殊情况
        // x < 0 x的个位数为0并且x != 0
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int originalValue = x;
        int reverseNumbers = 0;
        while (x != 0) {
            reverseNumbers = reverseNumbers * 10 + x % 10;
            x /= 10;
        }
        if (originalValue == reverseNumbers)
            return true;
        return false;
    }
}*/
class Solution009 {
    public boolean isPalindrome(int x) {
        // 当X是负数 或者x的个位数字为0且x不等于0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int re = 0;
        // 将该数字分两头开始计算 当 x < re 时证明到中点了
        while (re < x) {
            re = re * 10 + x % 10;
            x /= 10;
        }
        // 得到的结果分两种 1、 x的长度是偶数为 则 x== re
        //2、x的长度为奇数时 则 x == re / 10
        return x == re || x == re / 10;
    }
}