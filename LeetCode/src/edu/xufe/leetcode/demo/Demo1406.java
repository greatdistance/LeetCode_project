package edu.xufe.leetcode.demo;

import java.util.Arrays;

/**
 * @ClassName Demo1406
 * @Description 1046. 最后一块石头的重量
 * @Author greatDistance
 * @Date 2019/6/9 18:54
 * @Version 1.0
 */
public class Demo1406 {
    public static void main(String[] args) {
        int[] stone = {2, 7, 4, 1, 8, 1};
        System.out.println("new Solution1406().lastStoneWeight(stone) = " + new Solution1406().lastStoneWeight(stone));
    }
}

class Solution1406 {
    public int lastStoneWeight(int[] stones) {
        // 末尾下标
        int end = stones.length - 1;
        // 已处理的石头数量
        int count = 0;
        while (count != stones.length && count != end) {
            // 先排序
            Arrays.sort(stones);
            int x = stones[end - 1];
            int y = stones[end];
            //x == y，那么两块石头都会被完全粉碎；
            if (x == y) {
                // 粉碎的石头标记为-1
                stones[end - 1] = -1;
                stones[end] = -1;
                // 已处理的石头+2
                count += 2;
            } else {
                stones[end - 1] = stones[end] - stones[end - 1];
                // 粉碎的石头标记为-1
                stones[end] = -1;
                // 已处理的石头+2
                count += 1;
            }
        }
        Arrays.sort(stones);
        // count == stones.length 表示全部处理完返回0 否则剩下一个未处理 返回stones[end]
        return count == stones.length ? 0 : stones[end];
    }
}