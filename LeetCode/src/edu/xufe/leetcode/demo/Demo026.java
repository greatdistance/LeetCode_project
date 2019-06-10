package edu.xufe.leetcode.demo;

import java.util.Arrays;

public class Demo026 {
    public static void main(String[] args) {
        Solution026 solution = new Solution026();
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 4};
        System.out.println(solution.removeDuplicates(nums));

    }

}

class Solution026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        System.out.println(Arrays.toString(nums));
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
                System.out.println(Arrays.toString(nums));
            }
        }
        return j + 1;
    }
}