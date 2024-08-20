/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 反转字符串中的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        // 去除头部和尾部的空格。
    s.trim();
    int left=s.length()-1, right=left;
    StringBuffer stringBuffer=new StringBuffer();
    while (left>=0) {
       
        while (left>=0 && s.charAt(left)!=' ') {
           left--;
        }
        stringBuffer.append(s.substring(left+1, right+1)+" ");
        while (left>=0 && s.charAt(left)==' ') {
            left--;
        }
        right=left; 
    }
   
    return  stringBuffer.toString().trim();

    

    }
}
// @lc code=end

