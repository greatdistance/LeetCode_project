package edu.xufe.leetcode.demo;

import java.util.Arrays;

/**
 * @ClassName Demo075
 * @Description leetcode75. 颜色分类
 * @Author greatDistance
 * @Date 2019/5/9 22:09
 * @Version 1.0
 */
public class Demo075 {
    public static void main(String[] args) {
        int[] nums = {2};
        new Solution075().sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

class Solution075 {
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
     * 三路快排
     * 两个指针 zero 与two
     * zero前面的都是0
     * two后面的都是2
     * 两者之间的是1
     *
     * @param nums
     */
    public void sortColors(int[] nums) {
        // 数组nums的长度
        int numsLength = nums.length;
        // nums[0...zero] ==0
        int zero = -1;
        // nums[two...n-1] ==2 所以 nums[zero...two] ==1
        int two = numsLength;

        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                two--;
                // 交换
                if (i != two) {
                    swap(nums, i, two);
                }

            } else {
                zero++;
                // 交换
                if (i != zero) {
                    swap(nums, i, zero);
                }

                i++;
            }
        }
    }

    /**
     * 时间复杂度O(n)
     * 空间负责度O(k) k为颜色的种类 k是一个常数 可看做O(1)
     *
     * @param nums
     */
    public void sortColors1(int[] nums) {
        int numsLength = nums.length;
        // 用于计数 取值范围 0、1、2
        int[] count = new int[3];

        for (int i = 0; i < numsLength; i++) {
            count[nums[i]]++;
        }

        int index = 0;
        for (int i = 0; i < count[0]; i++) {
            nums[index++] = 0;
        }

        for (int i = 0; i < count[1]; i++) {
            nums[index++] = 1;
        }

        for (int i = 0; i < count[2]; i++) {
            nums[index++] = 2;
        }
    }
}