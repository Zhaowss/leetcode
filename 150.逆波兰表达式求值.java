/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start

import java.util.Deque;

class Solution {
    public int evalRPN(String[] tokens) {

        
        Deque<String> mystack=new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {

        if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/") ){
          String x_1=mystack.pop();  
          String x_2=mystack.pop();  
       

          if (tokens[i].equals("+")) {

           mystack.push(String.valueOf(Integer.valueOf(x_2)+Integer.valueOf(x_1)));
            
          }else if (tokens[i].equals("-")) {

            mystack.push(String.valueOf(Integer.valueOf(x_2)-Integer.valueOf(x_1)));
            
          }else if (tokens[i].equals("*")) {

            mystack.push(String.valueOf(Integer.valueOf(x_2)*Integer.valueOf(x_1)));
            
          }else{
            mystack.push(String.valueOf(Integer.valueOf(x_2)/Integer.valueOf(x_1)));
          }
          
         }else
         {
             mystack.push(tokens[i]);;
         }

        }


        return Integer.valueOf(mystack.pop());
      
     
    }
}
// @lc code=end

