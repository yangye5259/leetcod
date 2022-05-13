package com.yangye.nowcoder.nowcoder1_99;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yangye
 * @Date: 2022/5/13 22:05
 */
public class NC73 {

    public static void main(String[] args) {
        NC73 nc73 = new NC73();
        System.out.println(nc73.MoreThanHalfNum_Solution(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
        System.out.println(nc73.MoreThanHalfNum_Solution(new int[]{3, 3, 3, 3, 2, 2, 2}));
        System.out.println(nc73.MoreThanHalfNum_Solution(new int[]{3}));
    }

    public int MoreThanHalfNum_Solution(int[] array) {
        if (array.length <= 2) {
            return array[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.merge(num, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > array.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
