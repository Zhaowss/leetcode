/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {

        StringBuffer res=new StringBuffer();

        int start=0;
        while (start<s.length()) {  
            int left=start+k;
            int right=start+2*k;
            left=left>s.length()? s.length():left;
            right=right>s.length()? s.length():right;
            StringBuffer temp=new StringBuffer();
            temp.append(s.substring(start, left));
            res.append(temp.reverse());
            if (left<right) {
                res.append(s.substring(left,right));
            }
            start+=2*k;
        }

        return res.toString();
    }
}
// @lc code=end

