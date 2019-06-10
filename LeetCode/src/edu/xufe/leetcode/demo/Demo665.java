package edu.xufe.leetcode.demo;

/**
 * @ClassName Demo665
 * @Description 665. 非递减数列
 * @Author greatDistance
 * @Date 2019/6/9 17:50
 * @Version 1.0
 */
public class Demo665 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 3};
        /*int[] nums = {4, 2, 1};*/
        System.out.println("new Solution665().checkPossibility(nums) = " + new Solution665().checkPossibility(nums));
    }
}

class Solution665 {
    public boolean checkPossibility(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 1; i < length && count < 2; i++) {
            if (nums[i] >= nums[i - 1]) {
                continue;
            }
            count++;
            if (i >= 2 && nums[i - 2] > nums[i]) {
                // 是当前数字等于前一个数字
                nums[i] = nums[i - 1];
            } else {
                // 使前一个数字小于当前数字
                nums[i - 1] = Integer.MIN_VALUE;
            }
        }
        return count <= 1;
    }
}