package com.yangye.algo;

import com.yangye.CommonUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @Author: yangye
 * @Date: 2022/8/31 23:12
 */
public class QuickSort {


    public void quickSort(int[] nums) {
        if (Objects.isNull(nums) || nums.length <= 1) {
            return;
        }
        quickSort(0, nums.length - 1, nums);
    }

    private void quickSort(int left, int right, int[] nums) {
        if (left >= right) {
            return;
        }
        int partition = partition(left, right, nums);
        quickSort(0, partition - 1, nums);
        quickSort(partition + 1, right, nums);
    }

    private int partition(int left, int right, int[] nums) {
        int index = left + 1;
        while (index <= right) {
            if (nums[index] > nums[left]) {
                CommonUtil.swap(index, right, nums);
                right--;
            } else if (nums[index] < nums[left]) {
                CommonUtil.swap(index, left, nums);
                left++;
                index++;
            } else {
                index++;
            }
        }
//        return index - 1;
        return left;
    }

    public static void main(String[] args) {
        int[] ints = CommonUtil.generateIntArrayByInput(10, 20);
        System.out.println(Arrays.toString(ints));
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
