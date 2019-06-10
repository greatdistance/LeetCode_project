package edu.xufe.leetcode.trough;

/**
 * @ClassName BinarySearch
 * @Description 二分查找
 * @Author greatDistance
 * @Date 2019/6/10 13:26
 * @Version 1.0
 */
public class BinarySearch {
    private int binarySearch(int[] nums, int target) {
        // 左索引
        int left = 0;
        // 右索引
        int right = nums.length - 1;

        while (left <= right) {
            // 目标索引
            int mid = left + (right - left) / 2;
            // 找到了返回目标值的索引
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                // 更新区间左索引
                left = mid + 1;
            }
            if (target < nums[mid]) {
                // 更新区间右索引
                right = mid - 1;
            }
        }
        // 不存在返回-1
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(new BinarySearch().binarySearch(nums, 0));
    }
}
