package edu.xufe.leetcode.demo;

import java.util.Arrays;

/**
 * @ClassName Demo167
 * @Description leetcode 167. 两数之和 II - 输入有序数组
 * @Author greatDistance
 * @Date 2019/5/9 23:10
 * @Version 1.0
 */
public class Demo167 {


    public static void main(String[] args) {
        int[] nums = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(new Solution167().twoSum(nums, target)));
    }
}

class Solution167 {
    /**
     * 双指针
     * 左指针left 有指针right
     * 因为数组是有序的 所以可两边向中间检索
     * numbers[left] + numbers[right] < target 说明numbers[left]太小   left++
     * numbers[left] + numbers[right] > target 说明numbers[left]太大   right--
     * numbers[left] + numbers[right] == target return left+1 ,right+1
     *
     * @param numbers 目标数组
     * @param target  目标值
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        // 数组长度
        int length = numbers.length;
        if (null == numbers || length < 2) {
            // 返回[0, 0]表示无解
            System.out.println("返回[0, 0]表示无解");
            return new int[2];
        }
        // 左指针
        int left = 0;
        // 右指针
        int right = length - 1;
        // 两个指针不相撞
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            }

            if (numbers[left] + numbers[right] < target){
                left++;
            }

            if (numbers[left] + numbers[right] > target){
                right--;
            }
        }
        // 返回[0, 0]表示无解
        return new int[2];
    }
}