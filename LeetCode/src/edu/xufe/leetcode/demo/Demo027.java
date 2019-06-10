package edu.xufe.leetcode.demo;

public class Demo027 {
    public static void main(String[] args) {
        Solution027 solution = new Solution027();
        int[] nums = {3,2,2,3};
        System.out.println(nums.length);
        System.out.println(solution.removeDuplicates(nums, 3));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
    }

}

class Solution027 {
    public int removeDuplicates(int[] nums, int val) {
        int length = nums.length;
        if (length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}