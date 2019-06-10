package edu.xufe.leetcode.demo;

import java.util.Arrays;

public class Demo014 {
}

class Solution014 {
    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length <= 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        // 将字符串排序 排序后只需比较第一个字符串与最后一个字符串的公共前缀
        Arrays.sort(strs);
        int minLength = Math.min(strs[0].length(), strs[strs.length - 1].length());
        for (int i = 0; i < minLength; i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                break;
            }
            stringBuilder.append(strs[0].charAt(i));
        }
        return stringBuilder.toString();
    }
}