package edu.xufe.leetcode.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName Demo349
 * @Description leetcode349. 两个数组的交集
 * @Author greatDistance
 * @Date 2019/5/15 10:20
 * @Version 1.0
 */
public class Demo349 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(new Solution349().intersection(nums1, nums2)));
    }
}

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        Set<Integer> resultSet = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }
        int[] result = new int[resultSet.size()];
        int k = 0;
        Iterator<Integer> iterator = resultSet.iterator();
        while (iterator.hasNext()) {
            result[k++] = iterator.next();
        }
        return result;
    }
}