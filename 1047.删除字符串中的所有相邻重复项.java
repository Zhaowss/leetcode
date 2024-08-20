/*
 * @lc app=leetcode.cn id=1047 lang=java
 *
 * [1047] 删除字符串中的所有相邻重复项
 */

// @lc code=start

import java.util.Deque;

class Solution {
    public String removeDuplicates(String s) {
       char[] str= s.toCharArray();
       Deque<Character> mystack=new ArrayDeque<>();
       for (int i = 0; i < str.length; i++) {
       if(mystack.isEmpty() || mystack.peek()!=str[i]){
            mystack.push(str[i]);
        }else
        {
            mystack.pop();
        }
       }
      StringBuffer stringBuffer=new StringBuffer();
       while (!mystack.isEmpty()) {
        stringBuffer.append(mystack.pop());
       }
       return stringBuffer.reverse().toString();

    }
}
// @lc code=end

