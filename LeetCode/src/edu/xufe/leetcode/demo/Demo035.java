package edu.xufe.leetcode.demo;

public class Demo035 {
}

class Solution035 {
    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int location=0;
        for (int i = 0; i <length ; i++) {
            if (nums[i] < target){
                location++;
            }
        }
        return location;
    }

    public static void main(String[] args) {
        int []nums={1,3,5,6};
        System.out.println(searchInsert(nums, 8));
    }
}