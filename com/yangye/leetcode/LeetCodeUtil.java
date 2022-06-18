package com.yangye.leetcode;

/**
 * @Author: yangye
 * @Date: 2022/5/16 17:56
 */
public class LeetCodeUtil {


    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + "->");
            listNode = listNode.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
