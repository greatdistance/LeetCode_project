package edu.xufe.leetcode.demo;

public class Demo344 {
}

class Solution344 {
    public static void reverseString(char[] s) {
        final int length = s.length;
        // 首尾交换
        for (int i = 0; i <= length / 2; i++) {
            s[i] ^= s[length - 1 - i];
            s[length - 1 - i] ^= s[i];
            s[i] ^= s[length - 1 - i];
        }
    }

    public static void main(String[] args) {
        //char []s={'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
       char []s={'1','2','3','4','5','6'};
        reverseString(s);
        for (char c : s) {
            System.out.print("\""+c+"\",");
        }
    }
}