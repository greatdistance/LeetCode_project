package edu.xufe.leetcode.demo;

import java.util.Arrays;

/**
 * @ClassName Demo088
 * @Description leetcode 88. 合并两个有序数组
 * @Author greatDistance
 * @Date 2019/5/9 22:59
 * @Version 1.0
 */
public class Demo088 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0,0};
        int m = 0;
        int[] nums2 = {2, 5, 6};
        int n = 0;
        new Solution088().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        System.out.println("ok");
    }
}

class Solution088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 两个数组都从后往前扫描
        while (n > 0) {
            // 如果nums1数组中没有元素 将nums2中的元素全部放入nums
            if (m == 0) {
                System.arraycopy(nums2, 0, nums1, 0, n);
                break;
                // 如果nums1的元素比nums2的元素大
            } else if (nums1[m - 1] > nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
                // 如果nums1的元素比nums2的元素小
            }else{
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            }
        }
    }
}