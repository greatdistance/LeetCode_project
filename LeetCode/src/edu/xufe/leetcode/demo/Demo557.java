package edu.xufe.leetcode.demo;

/**
 * Leetcode：557. 反转字符串中的单词 III
 */
public class Demo557 {
}
class Solution557 {
    public static  String reverseWords(String s) {
        s = s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        String[] s1 = s.split("\\s+");
        for (int i = 0; i < s1.length; i++) {
            stringBuilder.append(s1[i]);
            stringBuilder1.append(stringBuilder.reverse()+" ");
            stringBuilder.delete(0,s1[i].length());
        }
        return stringBuilder1.toString().trim();
    }



    public static void main(String[] args) {
        System.out.println(reverseWords("  5444    dfsf   dfs  "));

    }
}