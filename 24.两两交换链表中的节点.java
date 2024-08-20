/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 */

// @lc code=start
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1,head);
        ListNode cur=dummy;
        while (cur.next!=null && cur.next.next!=null) {
            
            ListNode next3=cur.next.next.next;
            ListNode next2=cur.next;
            ListNode next1=cur.next.next;
            cur.next=next1;
            cur.next.next=next2;
            cur.next.next.next=next3;
            cur=cur.next.next;
        }
        return dummy.next;

    }
}
// @lc code=end

