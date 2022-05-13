package com.yangye.leetcode.leetcode1_99;

/**
 * @Author: yangye
 * @Date: 2022/5/12 14:48
 */
//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
//
// 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
//
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
//
// 请你实现这个将字符串进行指定行数变换的函数：
//
//
//string convert(string s, int numRows);
//
//
//
// 示例 1：
//
//
//输入：s = "PAYPALISHIRING", numRows = 3
//输出："PAHNAPLSIIGYIR"
//
//示例 2：
//
//
//输入：s = "PAYPALISHIRING", numRows = 4
//输出："PINALSIGYAHRPI"
//解释：
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
//
//
// 示例 3：
//
//
//输入：s = "A", numRows = 1
//输出："A"
//
//
//
//
// 提示：
//
//
// 1 <= s.length <= 1000
// s 由英文字母（小写和大写）、',' 和 '.' 组成
// 1 <= numRows <= 1000
//
// Related Topics 字符串 👍 1671 👎 0
public class LeetCode0006 {

    public static void main(String[] args) {
        LeetCode0006 leetCode0006 = new LeetCode0006();
        System.out.println(leetCode0006.convert("aaabbbccc", 3));
        System.out.println(leetCode0006.convert("qwrdgdsgg", 4));
        System.out.println(leetCode0006.convert("xvzsdgwer", 3));
        System.out.println(leetCode0006.convert("hjoontjuy", 3));
    }


    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        int index = 0;
        int flag = -1;
        for (char c : s.toCharArray()) {
            stringBuilders[index].append(c);
            if (index == 0 || index == numRows - 1) {
                flag = -flag;
            }
            index += flag;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : stringBuilders) {
            result.append(stringBuilder);
        }
        return result.toString();
    }
}
