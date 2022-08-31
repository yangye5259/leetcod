package com.yangye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @Author: yangye
 * @Date: 2022/8/31 23:06
 */
public class CommonUtil {

    public static int[] generateIntArrayByInput(int size, int max) {
        Random random = new Random();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = (random.nextInt(max));
        }
        return nums;
    }


    public static List<Integer> generateIntListByInput(int size, int max) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(max));
        }
        return list;
    }

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        List<Integer> list = generateIntListByInput(5, 10);
        Integer[] integers = list.toArray(new Integer[0]);
        System.out.println(list);
        System.out.println(Arrays.toString(integers));
    }
}
