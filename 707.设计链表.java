/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start

import java.util.List;

class MyLinkedList {
    // 作为链表的俩个元素，就是链表的节点和链表的大小

    int  size;
    ListNode head;
    // 初始化的方法。
    MyLinkedList(){
        head=new ListNode(-1);
    }

    // 获取链表中下标为index的节点的数值。
    int get(int index) {
        if (index<0 || index >=size) {
            return -1;
        }
        ListNode cur=head;
        while (index>=0) {
            cur=cur.next;
            index--;
        }
        return cur.val;
    }

    void addAtHead(int val){

        ListNode cur=head;
        // 记录之前的头节点的下一个节点
        ListNode next=cur.next;
        //重新设置当前的节点
        cur.next=new ListNode(val);
        //设置当前新的头节点的下一个节点。
        cur.next.next=next;
        size++;
    }

    void addAtTail(int val) {
        ListNode cur=head;
        while (cur.next!=null) {
            cur=cur.next;
        }
        cur.next=new ListNode(val);
        cur.next.next=null;
        size++;
    }

    void addAtIndex(int index, int val){
        ListNode cur=head;
        if (index<0 || index>size) {
           return;
        }

        while (index>0) {
            cur=cur.next;
            index--;
        }
        //此时的cur为我们插入节点的前一个节点
        ListNode next=cur.next;
        cur.next=new ListNode(val);
        cur.next.next=next;
        size++;
    }

    void deleteAtIndex(int index){
        if (index<0 || index>=size) {
            return;
         }

         ListNode cur=head;

        while (index>0) {
           cur=cur.next;
           index--;
        }

        cur.next=cur.next.next;

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

