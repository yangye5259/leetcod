package com.yangye.twst;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: yangye
 * @Date: 2022/5/18 14:41
 */
public abstract class TestInterFace {



    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        System.out.println(1);
    }
}

interface A{
    public static void main(String[] args) {
        Integer i = 1;
        Integer j = new Integer(1);
        System.out.println(i == j);
    }
}
