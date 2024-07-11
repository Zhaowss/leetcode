/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start

import java.util.List;

class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
       head=new ListNode(-1);
    }
    
    public int get(int index) {
       if (index<0 || index>=size) {
        return -1;
       }
       ListNode arr=head;

       while (index>=0) {
        arr=arr.next;
        index--;
       }
       return arr.val;
    }
    
    public void addAtHead(int val) {
        ListNode p=head;
        ListNode next1=p.next;
        p.next=new ListNode(val);
        p.next.next=next1;
        size++;
    }
    

    public void addAtTail(int val) {
        ListNode p=head;
        while (p.next!=null) {
            p=p.next;
        }
        p.next=new ListNode(val);
        p.next.next=null;
        size++;
    }
    

    public void addAtIndex(int index, int val) {
        if (index<0 || index > size) {
            return;
        }
        ListNode p=head;
        while (index>0) {
            p=p.next;
            index--;
        }

        ListNode node=p.next;
        p.next=new ListNode(val);
        p.next.next= node;
        size++;
    }
    

    public void deleteAtIndex(int index) {
        if (index<0 || index >= size)  {
            return;
        }
        ListNode p=head;

        while (index>0) {
            p=p.next;
            index--;
        }
        ListNode next=p.next.next;
        p.next=next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

