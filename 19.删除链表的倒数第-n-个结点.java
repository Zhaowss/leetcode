/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start

import java.util.List;

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
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode dumpy=new ListNode(-1);
//         dumpy.next=head;
//         ListNode  p=dumpy;
//         ListNode  p2=dumpy;
//         p.next=head;
//         p2.next=head;
//         // 定义一个双指针操作；
//         for (int i = 0; i < n+1; i++) {
//           p=p.next;
//         }
//         while (p!=null) {
//             p=p.next;
//             p2=p2.next;
//         }
//         p2.next=p2.next.next;
       
        
//         return dumpy.next;
//     }
// }



class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy=new ListNode(-1,head);
       ListNode p1=dummy, p2=dummy,temp=null;

       for (int i = 0; i <n; i++) {
          p1=p1.next;
       }
       while (p1.next!=null) {
        temp=p1;
        p1=p1.next;
        p2=p2.next;
       }
        p2.next=p2.next.next;
       return dummy.next;
    }
}
// @lc code=end

