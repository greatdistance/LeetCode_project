package edu.xufe.leetcode.demo;

/**
 * @ClassName Demo125
 * @Description leetcode 125. 验证回文串
 * @Author greatDistance
 * @Date 2019/5/9 23:38
 * @Version 1.0
 */
public class Demo125 {
    public static void main(String[] args) {
        //System.out.println("Character.toLowerCase('o') = " + Character.toLowerCase('O'));
      /*  System.out.println("Character.isLetterOrDigit('f') = " + Character.isLetterOrDigit('f'));
        System.out.println("Character.isLetterOrDigit('2') = " + Character.isLetterOrDigit('2'));
        System.out.println("Character.isLetterOrDigit(';') = " + Character.isLetterOrDigit(';'));
        System.out.println("Character.isLetterOrDigit(' ') = " + Character.isLetterOrDigit(' '));*/
        String s = "A man, a plan, a canal: Panama";
        String s1 = "race a car";
        String s2 = ",.ll,.l,.,.,";
        System.out.println(s2.length());
        System.out.println(new Solution125().isPalindrome(s));
        System.out.println(new Solution125().isPalindrome(s1));
        System.out.println(new Solution125().isPalindrome(s2));
    }
}

class Solution125 {
    public boolean isPalindrome(String s) {
        char[] s1 = s.toCharArray();
        int left = 0;
        int right =  s1.length - 1;
        while (left < right) {
            // 左边的字符
            char l = s1[left];
            // 右边的字符
            char r = s1[right];
            // 如果l不是是字母或数字
            if (!Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }
            // 如果l不是是字母或数字
            if (!Character.isLetterOrDigit(r)) {
                right--;
                continue;
            }
            // 大写转小写
            if (Character.isUpperCase(l)) {
                l = Character.toLowerCase(l);
            }
            // 大写转小写
            if (Character.isUpperCase(r)) {
                r = Character.toLowerCase(r);
            }
            if (l != r) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}