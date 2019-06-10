package edu.xufe.leetcode.demo;

import java.util.HashMap;
import java.util.Map;

public class Demo013 {
    public static void main(String[] args) {
        Solution013 solution = new Solution013();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("IV"));
        System.out.println(solution.romanToInt("IX"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}

class Solution013 {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int strLength = s.length();
        // 将最后一位赋值给result
        int result = map.get(s.charAt(s.length() - 1));
        // 从前往后扫描该字符串
        // 如果后一个比前一个大则减去第一个的值 否则加上第一个的值
        for (int i = 1; i < strLength; i++) {
            // 如果后一个比前一个值大 则减去第一个 否则相加
            if (map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                result -= map.get(s.charAt(i - 1));
            } else {
                result += map.get(s.charAt(i - 1));
            }
        }
        return result;

    }
}
/*class Solution13 {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                result += map.get(s.charAt(i));
            } else {
                result -= map.get(s.charAt(i));
            }
        }
        return result;

    }
}*/