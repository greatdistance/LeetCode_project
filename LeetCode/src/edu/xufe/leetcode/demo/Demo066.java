package edu.xufe.leetcode.demo;

import java.util.Arrays;

public class Demo066 {
}

class Solution066 {
    public  int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int arr[] = new int[length + 1];
        arr[0] = 1;
        System.arraycopy(digits, 0, arr, 1, length);
        return arr;
    }
}