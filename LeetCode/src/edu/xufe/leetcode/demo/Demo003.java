package edu.xufe.leetcode.demo;

/**
 * @ClassName Demo003
 * @Description leetcode 3. 无重复字符的最长子串
 * @Author greatDistance
 * @Date 2019/5/11 12:46
 * @Version 1.0
 */
public class Demo003 {
    public static void main(String[] args) {
        //System.out.println('A' + 1);

        String s = "bbbbb";
        System.out.println(s.charAt(0)+0);
        System.out.println(new Solution003().lengthOfLongestSubstring(s));
    }
}

class Solution003 {
    /**
     * 滑动窗口(双索引)
     * [left...right] 为我们的滑动窗口
     * 当[left...right]之间没有重复元素  right++
     * 当[left...right]之间有重复元素   left++
     *
     * @param s 源字符串
     * @return 最长子串的长度
     */
    public int lengthOfLongestSubstring(String s) {
        // 某字符出现的频率 初始化为0、0 表示未出现 1表示出现了
        int[] frequency = new int[256];
        // 字符串长度
        int length = s.length();
        int left = 0;
        int right = -1;

        // 最长子串的长度。
        int maxLength = 0;
        while (left < length) {
            if (right + 1 < length && frequency[s.charAt(right + 1)] == 0) {
                right++;
                frequency[s.charAt(right)]++;
            } else {
                frequency[s.charAt(left)]--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }
}