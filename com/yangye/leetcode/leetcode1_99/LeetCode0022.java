package com.yangye.leetcode.leetcode1_99;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: yangye
 * @Date: 2022/5/15 22:36
 */
//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
//
//
//
// 示例 1：
//
//
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
//
//
// 示例 2：
//
//
//输入：n = 1
//输出：["()"]
//
//
//
//
// 提示：
//
//
// 1 <= n <= 8
//
// Related Topics 字符串 动态规划 回溯 👍 2639 👎 0
public class LeetCode0022 {

    public static void main(String[] args) {
        LeetCode0022 leetCode0022 = new LeetCode0022();
        System.out.println(leetCode0022.generateParenthesis(1));
        System.out.println(leetCode0022.generateParenthesis(2));
        System.out.println(leetCode0022.generateParenthesis(3));
        System.out.println(leetCode0022.generateParenthesis(4));
    }

    public List<String> generateParenthesis(int n) {
        LinkedList<LinkedList<String>> result = new LinkedList<>();
        if (n == 0)
            return result.get(0);
        LinkedList<String> list0 = new LinkedList<>();
        list0.add("");
        result.add(list0);
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("()");
        result.add(list1);
        for (int i = 2; i <= n; i++) {
            LinkedList<String> temp = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                List<String> str1 = result.get(j);
                List<String> str2 = result.get(i - 1 - j);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        String el = "(" + s1 + ")" + s2;
                        temp.add(el);
                    }
                }

            }
            result.add(temp);
        }
        return result.get(n);
    }


}
