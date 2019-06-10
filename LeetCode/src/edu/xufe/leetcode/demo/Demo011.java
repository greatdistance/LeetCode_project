package edu.xufe.leetcode.demo;

/**
 * @ClassName Demo011
 * @Description leetcode11. 盛最多水的容器
 * @Author greatDistance
 * @Date 2019/5/11 15:33
 * @Version 1.0
 */
public class Demo011 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new Solution011().maxArea(height));
    }
}

class Solution011 {
    public int maxArea(int[] height) {
        // 左索引
        int left = 0;
        // 右索引
        int right = height.length - 1;
        // 最大容量
        int maxCapacity = 0;

        while (left < right) {
            // 容器的高
            int high = Math.min(height[left], height[right]);
            // 容器的底
            int bottom = right - left;
            maxCapacity = Math.max(maxCapacity, high * bottom);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return maxCapacity;
    }
}