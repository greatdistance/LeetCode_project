package edu.xufe.leetcode.demo;

import java.util.*;

/**
 * @ClassName Demo350
 * @Description 350. 两个数组的交集 II
 * @Author greatDistance
 * @Date 2019/5/15 10:40
 * @Version 1.0
 */
public class Demo350 {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(new Solution350().intersect(nums1, nums2)));
    }
}

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>(16);
        for (int num : nums1) {
            Integer count = map.get(num);
            // 将num出现的数值及频次放入map中
            if (count == null) {
                map.put(num, 1);
            } else {
                map.put(num, ++count);
            }
        }
        List<Integer> resultList = new ArrayList<Integer>();

        for (int num : nums2) {
            Integer count = map.get(num);
            if (count != null && count != 0) {
                resultList.add(num);
                map.put(num,--count);
            }
        }
        int[] result = new int[resultList.size()];
        int k = 0;
        for (Integer integer : resultList) {
            result[k++] = integer;
        }
        return result;
    }
}