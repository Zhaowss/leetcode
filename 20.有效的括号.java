/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public boolean isValid(String s) {
       char[] str= s.toCharArray();
       Deque<Character> staclDeque=new LinkedList<>();

       for (int i = 0; i < str.length; i++) {
        char s_temp=str[i];
        if (s_temp=='(' ) {
        staclDeque.push(')');
        }else if(s_temp=='{' ){
            staclDeque.push('}');
        }else if(s_temp=='[' ){
            staclDeque.push(']');
        }else if (staclDeque.isEmpty() || staclDeque.peek()!=s_temp) {
            return false;
        }else{
            staclDeque.pop();
        }
        
       }

       return staclDeque.isEmpty();


    }
}
// @lc code=end

