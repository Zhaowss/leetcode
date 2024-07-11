/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // 合并有序的俩个链表，首先考虑使用的是

        ListNode dumpy=new ListNode(-1),p=dumpy;
        // 定义一个虚拟的头节点

        while (list1!=null && list2!=null) {
            if (list1.val>list2.val) {
               p.next=list2;
               list2=list2.next;
            }else{
                p.next=list1;
                list1=list1.next;
             }
            //  指针向后移动的操作
            p=p.next;
        }

        if (list1!=null) {
            p.next=list1;
        }

        if (list2!=null) {
            p.next=list2;
        }
        return dumpy.next;

    }
}
// @lc code=end

