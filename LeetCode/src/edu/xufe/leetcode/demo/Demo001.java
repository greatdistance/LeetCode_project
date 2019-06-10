package edu.xufe.leetcode.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo001 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution001 solution = new Solution001();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}

class Solution001 {
    public int[] twoSum(int[] nums, int target) {
        if (null == nums || nums.length <= 1) {
            // 返回[0, 0]表示无解
            return new int[2];
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            Integer integer = map.get(nums[i]);
            if (null != integer && integer != i) {
                return new int[]{i, integer};
            }
        }
        // 返回[0, 0]表示无解
        return new int[2];
    }
}