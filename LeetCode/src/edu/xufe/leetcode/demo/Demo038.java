package edu.xufe.leetcode.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode:38报数
 */
public class Demo038 {
}

class Solution038 {
    public static String countAndSay(int n) {
        String str = "1";
        if (n == 1) {
            return str;
        }
        for (int i = 2; i <= n; i++) {
            int length = str.length();
            int count = 1;// 计数器
            int j = 0;
            StringBuilder s = new StringBuilder();
            while (j < length) {
                if (j + 1 >= length) {
                    s.append(count);
                    s.append(str.charAt(j));
                    count = 1;// 将计数器重置为1
                    j++;
                    continue;
                }
                if (str.charAt(j) == str.charAt(j + 1)) {
                    count++; //计数器加1
                    j++;
                    continue;
                } else {
                    s.append(count);
                    s.append(str.charAt(j));
                    count = 1;// 将计数器重置为1
                    j++;
                    continue;
                }
            }
            str = s.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
    }
}