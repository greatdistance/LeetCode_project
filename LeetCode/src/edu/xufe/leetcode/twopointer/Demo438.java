package edu.xufe.leetcode.twopointer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demo438
 * @Description leetcode438. 找到字符串中所有字母异位词
 * @Author greatDistance
 * @Date 2019/5/11 13:23
 * @Version 1.0
 */
public class Demo438 {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String p = "aaaaaaaaaaaaaaaa";
        System.out.println(new Solution438().findAnagrams(s, p));
    }
}

class Solution438 {
    /**
     * 判断是否是字母异位词
     * 对应字母出现相同的次数 则认为是字母异位词
     *
     * @param a 字符串1中各字母出现的频次数组
     * @param b 字符串2中各字母出现的频次数组
     * @return boolean
     */
    private boolean isLetterEctopic(int a[], int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        // 字符串s的长度
        int sLength = s.length();
        // 字符串p的长度
        int pLength = p.length();
        if (sLength <pLength){
            return list;
        }
        // 字符串p中字母出现的频次
        int[] pFrequency = new int[26];
        for (char c : p.toCharArray()) {
            pFrequency[c - 'a']++;
        }
        // 当前窗口中字符出现的频次
        int[] currentWindowFrequency = new int[26];
        // 初始化当前窗口
        for (int i = 0; i < pLength - 1; i++) {
            currentWindowFrequency[s.charAt(i) - 'a']++;
        }
        // 滑动窗口
        for (int i = pLength - 1; i < sLength; i++) {
            currentWindowFrequency[s.charAt(i) - 'a']++;

            if (isLetterEctopic(pFrequency, currentWindowFrequency)) {
                list.add(i - pLength + 1);
            }
            currentWindowFrequency[s.charAt(i - p.length() + 1) - 'a']--;

        }
        return list;
    }
}