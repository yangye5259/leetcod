package com.yangye.leetcode.leetcode1_99;

import java.util.Arrays;

/**
 * @Author: yangye
 * @Date: 2022/5/15 18:16
 */
//给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
//
// 返回这三个数的和。
//
// 假定每组输入只存在恰好一个解。
//
//
//
// 示例 1：
//
//
//输入：nums = [-1,2,1,-4], target = 1
//输出：2
//解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
//
//
// 示例 2：
//
//
//输入：nums = [0,0,0], target = 1
//输出：0
//
//
//
//
// 提示：
//
//
// 3 <= nums.length <= 1000
// -1000 <= nums[i] <= 1000
// -10⁴ <= target <= 10⁴
//
// Related Topics 数组 双指针 排序 👍 1144 👎 0
public class LeetCode0016 {

    public static void main(String[] args) {
        LeetCode0016 leetCode0016 = new LeetCode0016();
        System.out.println(leetCode0016.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        System.out.println(leetCode0016.threeSumClosest(new int[]{0, 0, 0}, 1));
        System.out.println(leetCode0016.threeSumClosest(new int[]{0, 2, 1, -3, 10, -5, 52, -10, 1, 1, 1, 3, 2, -3, -2, -1}, 1));
    }

    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        if (nums.length == 3) {
            for (int num : nums) {
                result += num;
            }
            return result;
        }
        result = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int curr = nums[i];
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int temp = curr + nums[left] + nums[right];
                if (temp == target) {
                    return target;
                }
                if (Math.abs(temp - target) < Math.abs(result - target)) {
                    result = temp;
                }
                if (temp > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}
