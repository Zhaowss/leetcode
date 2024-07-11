/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并 K 个升序链表
 */

// @lc code=start

import java.util.List;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0) {
            return null;
        }

        ListNode dumpy=new ListNode(-1),p=dumpy;

        PriorityQueue<ListNode> priorityQueue=new PriorityQueue<>(lists.length,(a,b)->(a.val-b.val));

        for (ListNode node : lists) {
            if (node!=null) {
                priorityQueue.add(node);      
            }
        }

        //将头节点全部存储到优先级的队列中之后执行下一步的操作

        while (!priorityQueue.isEmpty()) {
           ListNode node=priorityQueue.poll();
           p.next=node;
           p=p.next;
           if (node.next!=null) {
               priorityQueue.add(node.next);
           }
        }
        return dumpy.next;
    }
}
// @lc code=end

