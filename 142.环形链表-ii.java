/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow) {
                break;
            }
        }
        // 判断快指针是否为空，如果是的话说明这个不是坏子
        if (fast==null || fast.next==null) {
            return null;
        } 
        // 目前的话是slow指针走了K步，fast的指针走了2K步
        slow=head;
        // 慢指针回退到头指针，之后在相同的步长共同前进最后是slow就是这个环的起点
        while (slow!=fast) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
// @lc code=end

