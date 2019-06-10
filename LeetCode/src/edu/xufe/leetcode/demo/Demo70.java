package edu.xufe.leetcode.demo;

public class Demo70 {
}

class Solution070 {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}