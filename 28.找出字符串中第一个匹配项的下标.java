/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 找出字符串中第一个匹配项的下标
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        char[] haystackarr= haystack.toCharArray();
        char[] needlearr=needle.toCharArray();
        
      
        for (int i = 0; i <=haystack.length()-needle.length(); i++) {
            int count=0;   
            for (int j = 0; j <needle.length(); j++) {
                if (haystackarr[i+j]!=needlearr[j]) {
                    break;
                }else if (haystackarr[i+j]==needlearr[j]) {
                    count++;
                    if (count==needle.length()) {
                        return i;
                    }
                }
            }
        }

        return -1;

    }
}
// @lc code=end

