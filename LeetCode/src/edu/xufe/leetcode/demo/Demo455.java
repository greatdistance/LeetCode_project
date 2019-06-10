package edu.xufe.leetcode.demo;

import java.util.Arrays;

/**
 * @ClassName Demo455
 * @Description 455. 分发饼干
 * @Author greatDistance
 * @Date 2019/6/9 14:38
 * @Version 1.0
 */
public class Demo455 {
    public static void main(String[] args) {
        /*int []g={1,2,3};
        int []s={1,1};*/
        int []g={1,2};
        int []s={1,2,3};
        System.out.println("new Solution455().findContentChildren(g,s) = " + new Solution455().findContentChildren(g, s));
    }
}

class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        // 首先对两个数组排序
        Arrays.sort(g);
        Arrays.sort(s);
        // 两个数组的下标索引
        int gi = g.length - 1;
        int si = s.length - 1;
        // 满足孩子的数量
        int result = 0;
        // 分发饼干
        while (gi >= 0 && si >= 0) {
            // 将最大的饼干分给胃口最大的小孩 孩子满足
            if (g[gi] <= s[si]) {
                // 满足孩子数量+1
                result++;
                // 孩子胃口数下标-1
                gi--;
                // 饼干数组下标-1
                si--;
            } else {
                // 将最大的饼干分给胃口最大的小孩 孩子不满足
                // 将饼干分给胃口小一号的孩子
                gi--;
            }
        }
        return result;
    }
}