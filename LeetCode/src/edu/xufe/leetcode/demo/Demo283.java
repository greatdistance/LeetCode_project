package edu.xufe.leetcode.demo;

import java.util.Arrays;

/**
 * @ClassName Demo283
 * @Description leetcode283. 移动零
 * @Author greatDistance
 * @Date 2019/5/9 16:50
 * @Version 1.0
 */
public class Demo283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        new Solution283().moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }
}

class Solution283 {
    /**
     * 交换数组中下标a与下标b对应的值
     *
     * @param array
     * @param a
     * @param b
     */
    private void swap(int[] array, int a, int b) {
        array[a] ^= array[b];
        array[b] ^= array[a];
        array[a] ^= array[b];
    }

    /**
     * 方法三：
     * 时间复杂：时间O(n)
     * 空间复杂：时间O(1)
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        // 数组长度
        int numsLength = nums.length;
        // [0...index)区间均为非零元素
        int index = 0;
        if (null == nums || numsLength < 0) {
            return;
        }
        for (int i = 0; i < numsLength; i++) {
            if (nums[i] != 0) {
                // 全0数组 不交换
                if (index != i) {
                    swap(nums, index++, i);
                } else {
                    index++;
                }
            }
        }
    }

    /**
     * 方法二：
     * 时间复杂：时间O(n)
     * 空间复杂：时间O(1)
     *
     * @param nums
     */
    public void moveZeroes2(int[] nums) {
        int numsLength = nums.length;
        // 在nums数组中[0...k)的元素均为非零元素
        int k = 0;

        for (int i = 0; i < numsLength; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        // 区间[k...nums.length)之间的元素赋值为0
        for (int i = k; i < numsLength; i++) {
            nums[i] = 0;
        }
    }


    /**
     * 方法一：
     * 时间复杂：时间O(n)
     * 空间复杂：时间O(n)
     *
     * @param nums
     */
    public void moveZeroes1(int[] nums) {
        int numsLength = nums.length;
        int k = 0;
        // 存放不是非零元素的数组
        int[] nonZeroElement = new int[numsLength];
        for (int i = 0; i < numsLength; i++) {
            if (nums[i] != 0) {
                nonZeroElement[k++] = nums[i];
            }
        }
        System.arraycopy(nonZeroElement, 0, nums, 0, numsLength);
    }
}