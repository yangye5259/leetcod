package com.yangye.leetcode500_599;

/**
 * @Author: yangye
 * @Date: 2022/5/12 20:18
 */
//对于一个 正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。
//
// 给定一个 整数 n， 如果是完美数，返回 true；否则返回 false。
//
//
//
// 示例 1：
//
//
//输入：num = 28
//输出：true
//解释：28 = 1 + 2 + 4 + 7 + 14
//1, 2, 4, 7, 和 14 是 28 的所有正因子。
//
// 示例 2：
//
//
//输入：num = 7
//输出：false
//
//
//
//
// 提示：
//
//
// 1 <= num <= 10⁸
//
// Related Topics 数学 👍 179 👎 0
public class LeetCode0507 {

    public static void main(String[] args) {
        LeetCode0507 leetCode0507 = new LeetCode0507();
        System.out.println(leetCode0507.checkPerfectNumber(7));
        System.out.println(leetCode0507.checkPerfectNumber(20));
        System.out.println(leetCode0507.checkPerfectNumber(18));
        System.out.println(leetCode0507.checkPerfectNumber(28));
    }

    public boolean checkPerfectNumber(int num) {
        int temp = (int) Math.sqrt(num);
        int add = 0;
        for (int i = 1; i <= temp; i++) {
            if (num % i == 0) {
                if (i != num) {
                    add += i;
                }
                if (num / i != num) {
                    add += num / i;
                }
            }
        }
        return add == num;
    }
}
