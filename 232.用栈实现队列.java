/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {

    Deque<Integer> deque_in;

    Deque<Integer> deque_out;


    public MyQueue() {

        deque_in=new ArrayDeque<>();
        deque_out=new ArrayDeque<>();


    }
    
    public void push(int x) {
        
        deque_in.push(x);
    }
    
    public int pop() {
        if (deque_out.isEmpty()) {
            Outisempty();
        }

        return deque_out.pop();

    }
    
    public int peek() {
        if (deque_out.isEmpty()) {
            Outisempty();
        }
        return deque_out.peek();

    }
    
    public boolean empty() {

        return deque_in.isEmpty() && deque_out.isEmpty();

    }
    public void Outisempty(){
        while (!deque_in.isEmpty()) {
            deque_out.push(deque_in.pop());
        }
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

