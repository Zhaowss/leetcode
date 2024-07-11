/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
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
// class Solution {
//     public ListNode partition(ListNode head, int x) {
//         ListNode  dumpy1=new ListNode(-1);
//         ListNode  dumpy2=new ListNode(-1);
//         ListNode  p1=dumpy1,p2=dumpy2,p=head;

//        while(p!=null){
//         // 首先判断链表的数值和目标值的大小关系
//         if (p.val>=x) {
//         // 如果链表的数值大于等于目标的数值
//             p2.next=p;
//         // 则p2的下一个节点指向P   p2[-1,1,]
//             p2=p2.next;
//         }else{
//             p1.next=p;
//             p1=p1.next;
//             //                p1[-1,1,4,3,2,5,2]
//         }

//         // 前面完成P1和P2的操作之后，其实这个指针的P的位置还么有操作
//         // 我们需要断开P1和P2之后P指针

//         ListNode temp=p.next;
//         p.next=null;          //               p1[-1,1]
//         p=temp;               //               p[4,3,2,5,2]

//        }
//        p1.next=dumpy2.next;
//        return dumpy1.next;

//     }
// }


class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode  dumpy1=new ListNode(-1);
        ListNode  dumpy2=new ListNode(-1);
        ListNode  p1=dumpy1,p2=dumpy2,p=head;

       while(p!=null){
        // 首先判断链表的数值和目标值的大小关系
        if (p.val>=x) {
        // 如果链表的数值大于等于目标的数值
            p2.next=new ListNode(p.val);
        // 则p2的下一个节点指向P   p2[-1,1,]
            p2=p2.next;
        }else{
            p1.next=new ListNode(p.val);
            p1=p1.next;
            //                p1[-1,1,4,3,2,5,2]
        }
        p=p.next;

        // 前面完成P1和P2的操作之后，其实这个指针的P的位置还么有操作
        // 我们需要断开P1和P2之后P指针

        // ListNode temp=p.next;
        // p.next=null;          //               p1[-1,1]
        // p=temp;               //               p[4,3,2,5,2]

       }
       p1.next=dumpy2.next;
       return dumpy1.next;

    }
}
// @lc code=end

