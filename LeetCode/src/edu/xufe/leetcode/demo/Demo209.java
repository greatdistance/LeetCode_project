package edu.xufe.leetcode.demo;

/**
 * @ClassName Demo209
 * @Description lsstcode209. 长度最小的子数组
 * @Author greatDistance
 * @Date 2019/5/9 23:51
 * @Version 1.0
 */
public class Demo209 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int s= 1;
        System.out.println(new Solution209().minSubArrayLen(s, nums));
    }
}

class Solution209 {
    /**
     * 滑动窗口(双索引 left，right)
     * nums[left...right] 为我们的滑动窗口
     * 当[left...right]之间的和 < s right++
     * 当[left...right]之间的和 > s left++
     *
     * @param s    目标值
     * @param nums 原数组
     * @return
     */
    public int minSubArrayLen(int s, int[] nums) {
        if (null == nums || nums.length <0){
            return 0;
        }
        // 数组nums的长度
        int length = nums.length;
        // 左索引
        int left = 0;
        // 右索引 初始化为-1  初始时不包括任何元素
        int right = -1;
        // 最小长度 初始化为比nums长度+1  然后逐步取最小值
        int minLength = length + 1;
        // nums[left...right] 之间和
        int sum = 0;

        while (left < length) {
            if (right + 1 < length && sum < s) {
                right++;
                sum += nums[right];
            } else {
                sum -= nums[left];
                left++;
            }
            if (sum >= s) {
                minLength = Math.min(minLength, right - left + 1);
            }
        }

        // 无解的情况
        if (minLength == length + 1) {
            return 0;
        }
        return minLength;
    }
}