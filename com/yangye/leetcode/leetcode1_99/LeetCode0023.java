package com.yangye.leetcode.leetcode1_99;

import com.yangye.leetcode.LeetCodeUtil;
import com.yangye.leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yangye
 * @Date: 2022/5/16 17:51
 */
public class LeetCode0023 {

    public static void main(String[] args) {
        LeetCode0023 leetCode0023 = new LeetCode0023();
        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        listNodes[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        listNodes[2] = new ListNode(2, new ListNode(6));
        ListNode listNode = leetCode0023.mergeKLists(listNodes);
        LeetCodeUtil.printListNode(listNode);
    }


    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        List<Integer> integerList = new ArrayList<>();
        for (ListNode node : lists) {
            while (node != null) {
                integerList.add(node.val);
                node = node.next;
            }
        }
        if (integerList.isEmpty()) {
            return null;
        }
        integerList = integerList.stream().sorted().collect(Collectors.toList());
        ListNode listNode = new ListNode();
        ListNode head = listNode;
        for (int i = 0; i < integerList.size(); i++) {
            listNode.val = integerList.get(i);
            if (i != integerList.size() - 1) {
                listNode.next = new ListNode();
                listNode = listNode.next;
            }
        }
        return head;
    }

    /**
     * 合并两个链表的问题
     */
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return a != null ? a : b;
        }
        //虚拟头节点
        ListNode head = new ListNode(0);
        ListNode tail = head;
        ListNode aPtr = a;
        ListNode bPtr = b;
        while (aPtr != null && bPtr != null) {
            if (aPtr.val < bPtr.val) {
                tail.next = aPtr;
                aPtr = aPtr.next;
            } else {
                tail.next = bPtr;
                bPtr = bPtr.next;
            }
            tail = tail.next;
        }
        tail.next = (aPtr != null ? aPtr : bPtr);
        return head.next;
    }
}
