/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {        
        ListNode p=head,p2=head;
        ListNode pre=null;
        ListNode pr=new ListNode(-1);
        ListNode ps=pr;
        // 将原石的链表保存一份
        while (p2!=null){
            pr.next=new ListNode(p2.val);
            pr=pr.next;
            p2=p2.next;
        }

        // 将链表进行反转的操作
        while (p!=null) {
            ListNode cu=p.next;
            p.next=pre;
            pre=p;
            p=cu;
        }
        ps=ps.next;


//       链表的实际的结果应该和我们的事匹配的。
        while(pre!=null){
            if (pre.val!=ps.val) {
                return false;
            }
            pre=pre.next;
            ps=ps.next;
        }

        return true;
            }
}
// @lc code=end

