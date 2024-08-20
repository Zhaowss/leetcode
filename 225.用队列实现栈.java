/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {

    Deque<Integer> aDeque_in=new ArrayDeque<>();
    Deque<Integer> aDeque_out=new ArrayDeque<>();

    public MyStack() {

    }
    
    public void push(int x) {
        //这样来的都在队列的后面，因此弹出的时遵循先入后出
        while (!aDeque_in.isEmpty()) {
            aDeque_out.add(aDeque_in.pop());
        }

        aDeque_in.add(x);
        //最后加入的放在队列的最前面
        //之前的加入的放在队列的后面
        //这样就可以实现我们的先入后出的原则了
        while (!aDeque_out.isEmpty()) {
            aDeque_in.add(aDeque_out.pop());
        }

    }
    
    public int pop() {
       return aDeque_in.pop();
    }
    
    public int top() {
       return aDeque_in.peek();

    }
    
    public boolean empty() {
       return aDeque_in.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

