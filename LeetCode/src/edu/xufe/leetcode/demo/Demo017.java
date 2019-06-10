package edu.xufe.leetcode.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demo017
 * @Description 17. 电话号码的字母组合
 * @Author greatDistance
 * @Date 2019/6/9 23:27
 * @Version 1.0
 */
public class Demo017 {
    public static void main(String[] args) {
        String digits = "234";
        System.out.println("new Solution017().letterCombinations(digits) = " + new Solution017().letterCombinations(digits));
    }
}

class Solution017 {
    /**
     * 常量 存放键值对应的字符串
     */
    private final String[] LETTER_MAP = {
            " ",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    private List<String> result = new ArrayList<String>();

    /**
     * 寻找和digits[index]匹配的字母，获得digits[0...index]翻译得到的解
     *
     * @param digits
     * @param index
     * @param s      保存从digits[0...index-1]翻译得到的一个字母字符串
     * @return
     */
    private void findCombinations(String digits, int index, String s) {
        if (index == digits.length()) {
            // 保存s
            this.result.add(s);
            return;
        }
        // 得到digits索引index的键值
        char c = digits.charAt(index);
        // 找出该键值对应的字母字符串
        String letters = LETTER_MAP[c - '0'];
        for (int i = 0; i < letters.length(); i++) {
            // 递归调用
            findCombinations(digits, index + 1, s + letters.charAt(i));
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || "".equals(digits)) {
            return this.result;
        }
        this.findCombinations(digits, 0, "");
        return this.result;
    }
}