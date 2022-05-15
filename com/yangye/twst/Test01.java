package com.yangye.twst;

/**
 * @Author: yangye
 * @Date: 2022/5/15 23:03
 */
public class Test01 {

    public static void main(String[] args) {
        String string = "()()";
        for (int i = 0; i < string.toCharArray().length - 1; i++) {
            if (string.charAt(i) == '(' && string.charAt(i+1) == ')') {
                String temp1 = string.substring(0, i+1);
                String temp2 = string.substring(i+1, string.toCharArray().length);
                String string4 = temp1 + "()" + temp2;
                System.out.println(string4);
            }
        }
    }
}
