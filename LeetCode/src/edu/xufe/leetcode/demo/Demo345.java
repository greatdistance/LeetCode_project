package edu.xufe.leetcode.demo;

/**
 * @ClassName Demo345
 * @Description leetcode345. 反转字符串中的元音字母
 * @Author greatDistance
 * @Date 2019/5/9 23:42
 * @Version 1.0
 */
public class Demo345 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(new Solution345().reverseVowels(s));
    }
}

class Solution345 {
    /**
     * 交换字符数组c,i,j对应索引的值
     *
     * @param c
     * @param i
     * @param j
     */
    private void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    /**
     * 字符c是元音字母Aa、Oo、Ee、Ii、Uu
     *
     * @param c
     * @return
     */
    private boolean isVowelLetter(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            // 两个都是元音字母
            if (isVowelLetter(charArray[left]) && isVowelLetter(charArray[right])) {
                // 交换两个字母
                swap(charArray, left, right);
                // 左索引+1
                left++;
                // 右索引-1
                right--;
            }

            // 两个都不是元音字母
            if (!isVowelLetter(charArray[left]) && !isVowelLetter(charArray[right])) {
                // 左索引+1
                left++;
                // 右索引-1
                right--;
                continue;
            }
            // 如果左边字符不是元音字母，右边的是
            if (!isVowelLetter(charArray[left]) && isVowelLetter(charArray[right])) {
                left++;
                continue;
            }

            // 如果左边字符是元音字母，右边的不是
            if (isVowelLetter(charArray[left]) && !isVowelLetter(charArray[right])) {
                right--;
                continue;
            }
        }
        return new String(charArray);
    }
}