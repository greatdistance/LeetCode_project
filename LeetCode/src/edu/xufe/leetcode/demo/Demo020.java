package edu.xufe.leetcode.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Demo020 {
}

class Solution020 {
    public static boolean isValid(String s) {
        final int length = s.length();
        // 如果字符串长度为奇数则一定不符合
        if (null == s || (length & 1) == 1) {
            return false;
        }
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < length; i++) {
            final char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                try {
                    // 查看栈顶元素与当前元素是否成对，是：删除栈顶元素 否：return false
                    if (map.get(stack.peek()) == c) {
                        stack.pop();
                    }
                } catch (Exception e) {
                    // 当栈为空时还要删除时会抛出EmptyStackException异常 如第一个字符不是(、[、{时
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid(""));
    }
}