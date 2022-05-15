package com.yangye.leetcode.leetcode1_99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yangye
 * @Date: 2022/5/15 17:25
 */
//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
//复的三元组。
//
// 注意：答案中不可以包含重复的三元组。
//
//
//
// 示例 1：
//
//
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//
//
// 示例 2：
//
//
//输入：nums = []
//输出：[]
//
//
// 示例 3：
//
//
//输入：nums = [0]
//输出：[]
//
//
//
//
// 提示：
//
//
// 0 <= nums.length <= 3000
// -10⁵ <= nums[i] <= 10⁵
//
// Related Topics 数组 双指针 排序 👍 4762 👎 0
public class LeetCode0015 {

    public static void main(String[] args) {
        LeetCode0015 leetCode0015 = new LeetCode0015();
        System.out.println(leetCode0015.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return lists;
        }
        //排序
        Arrays.sort(nums);
        //双指针
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            //如果已经大于0了，没必要走后续
            if (nums[i] > 0) {
                return lists;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int curr = nums[i];
            //左指针
            int L = i + 1;
            //右指针
            int R = len - 1;

            while (L < R) {
                int tmp = curr + nums[L] + nums[R];
                if (tmp == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    while (L < R && nums[L + 1] == nums[L]) {
                        ++L;
                    }
                    while (L < R && nums[R - 1] == nums[R]) {
                        --R;
                    }
                    ++L;
                    --R;
                } else if (tmp < 0) {
                    ++L;
                } else {
                    --R;
                }
            }
        }
        return lists;
    }
}
