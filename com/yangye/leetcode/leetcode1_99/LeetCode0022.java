package com.yangye.leetcode.leetcode1_99;

import java.util.ArrayList;
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
        List<String> result = new ArrayList<>();
        if (n == 0) {
            result.add("");
            return result;
        }
        if (n == 1) {
            result.add("()");
            return result;
        }

        for (int i = 0; i < n; i++) {
            List<String> list1 = generateParenthesis(i);
            List<String> list2 = generateParenthesis(n - 1 - i);
            for (String s1 : list1) {
                for (String s2 : list2) {
                    String temp = "(" + s1 + ")" + s2;
                    if (!result.contains(temp)) {
                        result.add(temp);
                    }
                }
            }
        }
        return result;
    }


}
