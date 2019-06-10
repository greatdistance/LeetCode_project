package edu.xufe.leetcode.demo;

public class Demo007 {

    public static void main(String[] args) {
        int x = 2147483647;
        Solution007 solution = new Solution007();
        System.out.println(solution.reverse(x));

    }

}

class Solution007 {
    public  int reverse(int x) {
        int result = 0;
        int symbol = x < 0 ? -1 : 1;
        x=Math.abs(x);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x);
        stringBuilder.reverse();

        try {
            result=Integer.parseInt(stringBuilder.toString()) * symbol;
        } catch (NumberFormatException e) {
            return 0;
        }

        return result;
    }

}
/*
class Solution7 {
    public int reverse(int x) {
        int sum = 0;
        do {
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && x % 10 > 7)) return 0;
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && x % 10 < -8)) return 0;
            sum = sum * 10 + x % 10;
            x = x / 10;
        } while (x != 0);
        return sum;
    }
}*/