package edu.xufe.leetcode.demo;

import java.util.Arrays;

/**
 * @ClassName Demo215
 * @Description leetcode215. 数组中的第K个最大元素
 * @Author greatDistance
 * @Date 2019/5/9 23:01
 * @Version 1.0
 */
public class Demo215 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(new Solution215().findKthLargest(nums, k));
    }
}

class Solution215 {
    /**
     * 交换数组中下标i与下标j对应的值
     *
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * @param array
     * @param left
     * @param right
     * @return
     */
    private int partition(int[] array, int left, int right) {
        // 将第一个元素作为哨兵点  哨兵点左边的元素比它小 右边的元素都比它大
        int sentry = array[right];
        int i = left;
        int j = left;
        for (; j < right; j++) {
            if (array[j] > sentry) {
                if (i == j) {
                    i++;
                } else {
                    swap(array, i, j);
                    i++;
                }
            }
        }
        swap(array, i, right);
        return i;

    }

    /**
     * 找第k大的数
     *
     * @param array 原数组
     * @param left  开始位置
     * @param right 截止位置
     * @param k     找第几大的数
     * @return
     */
    private int find(int[] array, int left, int right, int k) {
        // 查找出的结果
        int result;
        int partition = partition(array, left, right);
        if (partition + 1 == k) {
            result = array[partition];
        } else if (partition + 1 < k) {
            result = find(array, partition + 1, right, k);
        } else {
            result = find(array, left, partition - 1, k);
        }
        return result;

    }

    public int findKthLargest(int[] nums, int k) {
        return find(nums, 0, nums.length - 1, k);
    }

    public int findKthLargest1(int[] nums, int k) {
       /* Arrays.sort(nums);
        int result=0;
        // nums数组的长度
        int length = nums.length;
        for (int i = 0; i < length; i++,k++) {
            if (k == length){
                result= nums[i];
            }
        }
        return result;*/
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}