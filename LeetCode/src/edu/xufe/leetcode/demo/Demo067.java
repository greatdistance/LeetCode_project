package edu.xufe.leetcode.demo;

public class Demo067 {
}

class Solution067 {
    public String addBinary(String a, String b) {
        if (a == null || b == null) {
            return "";
        }
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        // 进位
        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (aLength >= 0 || bLength >= 0) {
            int value1 = 0;
            int value2 = 0;
            if (aLength >= 0) {
                value1 = a.charAt(aLength--) - 48;
            }
            if (bLength >= 0) {
                value2 = b.charAt(bLength--) - 48;
            }
            int value3 = value1 + value2 + carry;
            // value3%2
            stringBuilder.append(value3 & 1);
            carry = value3 >> 1;
        }
        if (carry == 1) {
            stringBuilder.append(1);
        }
        return stringBuilder.reverse().toString();
    }
}