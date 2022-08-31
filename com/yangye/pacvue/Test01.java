package com.yangye.pacvue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yangye
 * @Date: 2022/7/7 19:16
 */
public class Test01 {

    public String revert(String a) {
        if (a == null || a.length() <= 1) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = a.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    public List<String> intersect(String[] a, String[] b) {
        List<String> result = new ArrayList<>();
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return result;
        }
        Map<String, String> map = new HashMap<>();
        for (String s : a) {
            map.put(s, s);
        }
        for (String s : b) {
            if (map.containsKey(s)) {
                result.add(s);
            }
        }
        return result;
    }



    public static void main(String[] args) {
        Test01 test01 = new Test01();
        System.out.println(test01.revert("abc"));
        String[] a = {"abc", "123", "999"};
        String[] b = {"abc", "123", "654"};
        System.out.println(test01.intersect(a, b));
    }

}
