/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start

class Solution {

    
    public boolean isPalindrome(int x) {
        int count=0;
        String mystring=String.valueOf(x);
        for (int i = 0; i <( mystring.length()/2); i++) {
            if (mystring.charAt(i) ==mystring.charAt(mystring.length()-i-1)) {
              count++;
            }
        }
        if (count==(mystring.length()/2)) {
            return true;   
        }else{
            return false;
        }
       
    }
}
// @lc code=end

