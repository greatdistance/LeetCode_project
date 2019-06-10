package edu.xufe.leetcode.demo;

/**
 * Leetcode:292. Nim游戏
 */
public class Demo292 {
}

class Solution292 {
    public static boolean canWinNim(int n) {
        return (n % 4) != 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(canWinNim(1));
    }
}