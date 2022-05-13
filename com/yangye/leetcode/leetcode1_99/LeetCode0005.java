package com.yangye.leetcode.leetcode1_99;

/**
 * @Author: yangye
 * @Date: 2022/5/11 17:10
 */
/*
给你一个字符串 s，找到 s 中最长的回文子串。

示例 1：

输入：s = "babad"
输出："bab"
解释："aba" 同样是符合题意的答案。
示例 2：

输入：s = "cbbd"
输出："bb"
提示：

1 <= s.length <= 1000
s 仅由数字和英文字母组成
Related Topics
字符串
动态规划

👍 5197
👎 0
 */
public class LeetCode0005 {

    public static void main(String[] args) {
        LeetCode0005 leetCode0005 = new LeetCode0005();
        System.out.println(leetCode0005.longestPalindrome("babac"));
        System.out.println(leetCode0005.longestPalindrome("aaaaacccccaaaaa"));
        System.out.println(leetCode0005.longestPalindrome("abbc"));
    }


    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = extend(s, i, i);
            int len2 = extend(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int extend(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }


}
