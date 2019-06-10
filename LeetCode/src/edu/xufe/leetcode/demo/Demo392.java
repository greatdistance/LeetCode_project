package edu.xufe.leetcode.demo;

/**
 * @ClassName Demo392
 * @Description TODO
 * @Author greatDistance
 * @Date 2019/6/9 17:13
 * @Version 1.0
 */
public class Demo392 {
    public static void main(String[] args) {
       /* String s = "abc";
        String t = "ahbgdc";*/
        String s = "axc";
        String t = "ahbgdc";
        System.out.println("new Solution392().isSubsequence(s, t) = " + new Solution392().isSubsequence(s, t));
    }
}

class Solution392 {
    public boolean isSubsequence(String s, String t) {
        // 起始索引
        int index = -1;
        for (char c : s.toCharArray()) {
            // 查询字符在不在字符串t中
            index = t.indexOf(c, index + 1);
            // 查询不到
            if (index == -1) {
                return false;
            }
        }
        return true;
    }
}