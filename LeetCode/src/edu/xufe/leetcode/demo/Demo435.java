package edu.xufe.leetcode.demo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName Demo435
 * @Description 435. 无重叠区间
 * @Author greatDistance
 * @Date 2019/6/9 15:07
 * @Version 1.0
 */
public class Demo435 {
    public static void main(String[] args) {
        /* int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};*/
        /* int[][] intervals = {{1, 2},{1, 2},{1, 2}};*/
        int[][] intervals = {{1, 2}, {2, 3}};
        System.out.println("排序前：");
        for (int a = 0; a < intervals.length; a++) {
            for (int i = 0; i < intervals[a].length; i++) {
                System.out.print(intervals[a][i] + " ");
            }
            System.out.println();
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        System.out.println("排序后:");
        for (int a = 0; a < intervals.length; a++) {
            for (int i = 0; i < intervals[a].length; i++) {
                System.out.print(intervals[a][i] + " ");
            }
            System.out.println();
        }
        System.out.println("new Solution435().eraseOverlapIntervals(intervals) = " + new Solution435().eraseOverlapIntervals(intervals));
    }
}

class Solution435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        // 特殊情况处理
        if (intervals.length == 0) {
            return 0;
        }
        // 先排序 以区间末端从小到大排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        // 最多能组成的不重叠区间个数
        int count = 1;
        // 前一区间的末端位置
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            // 两个区间有重叠
            if (intervals[i][0] < end) {
                continue;
            }
            // 两个区间无重叠 修正前一区间末端位置
            end = intervals[i][1];
            // 不重叠区间数+1
            count++;
        }
        // 总区间数 - 不重叠区间数 = 要删去的区间数
        return intervals.length - count;
    }
}