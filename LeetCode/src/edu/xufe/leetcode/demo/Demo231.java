package edu.xufe.leetcode.demo;

public class Demo231 {
}

class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if (n < 0) {
            return false;
        }
        // 2的幂 二进制只有一位为1
        return (n & (n - 1)) == 0;
    }
}