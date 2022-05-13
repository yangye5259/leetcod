package com.yangye.huawei;

/**
 * @Author: yangye
 * @Date: 2022/5/13 22:15
 */
/*
给定一个字符串描述的算术表达式，计算出结果值。

输入字符串长度不超过 100 ，合法的字符包括 ”+, -, *, /, (, )” ， ”0-9” 。

数据范围：运算过程中和最终结果均满足 |val| \le 2^{31}-1 \∣val∣≤2
31
 −1  ，即只进行整型运算，确保输入的表达式合法
输入描述：
输入算术表达式

输出描述：
计算出结果值

示例1
输入：
400+5
输出：
405
 */
public class HJ54 {

    public static void main(String[] args) {
        HJ54 hj54 = new HJ54();
        System.out.println(hj54.solution("400+10/(2+3)"));
        System.out.println(400 + 10 / (2 + 3));
    }

    public int solution(String source) {


        return 0;
    }
}
