/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    class MonotonicQueue{
        //其关键在于pop 和push的操作
        //也就是我们在pop的时候进行我们需要判断其前面的数值是不是大于当前的要入栈的数
        //如果当前入栈的数是大于前面的所有的数，我们需要将其前面的数进行弹出
        //
     //实现一个队列，其可以通过POP维护当前队列中的最大值
     Deque<Integer> deque=new LinkedList<>();
     public void push(int n){
       while (!deque.isEmpty() && deque.getLast() < n) {
        deque.pollLast();
       }
       //将比他小的前面的全部pop出去
       //然后将其放入，其实已经放到队头部了
       deque.addLast(n);
     }
     public int max(){
        return deque.getFirst();
     }

     public void pop(int n){
        //弹出不部分我们维护一个最大的门口元素的弹出即可
        if (n ==deque.getFirst()) {
            deque.pollFirst();
        }
     }  
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        MonotonicQueue monotonicQueue=new MonotonicQueue();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i< k-1) {
                
                monotonicQueue.push(nums[i]);
            }else{
                //步进式前进，并且将维护的窗口元素删除
                //让最后的进队列，
                monotonicQueue.push(nums[i]);
                list.add(monotonicQueue.max());
                //前面的队列的最前面是最大的，保存下之后
                //我们将其对应的最前的元素弹出即可
                monotonicQueue.pop(nums[i-(k-1)]);
            }
        }
       int[] res=new int[list.size()];
       for (int i = 0; i < list.size(); i++) {
         res[i]=list.get(i);
       }

       

        return res;

    }
}
// @lc code=end

