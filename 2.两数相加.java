/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null,tail=null;
        int carry=0;
        while (l1!=null || l2 !=null) {

            // 遍历链表
            int n1= l1!=null ? l1.val:0;
            int n2= l2!=null ? l2.val:0;
            int sum=n1+n2+carry;
            if (head==null &tail==null) {
                head=tail=new ListNode(sum%10);
            }else
            {
                tail.next=new ListNode(sum%10);
                tail=tail.next;
            }
            carry=sum/10;
            if (l1!=null) {
                
             l1=l1.next;

            }

            if (l2!=null) {
                
                l2=l2.next;
                
               }
            
        }
        // 全部轮巡结束，然后检查进位，如果进位大衣0 ，则将其接到当前节点的后面
        
        if (carry>0) {
            tail.next=new ListNode(carry);
        }
        return head;

    }
}
// @lc code=end

