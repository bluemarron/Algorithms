package com.jack;

import java.util.Arrays;

/**
 * Created by jack on 2016. 2. 1..
 */
public class KthLargesElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println("result: " + findKthLargest(nums, 2));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
