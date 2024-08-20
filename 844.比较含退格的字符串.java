/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start


class Solution {
    public boolean backspaceCompare(String s, String t) {
      

        int slow=0;
        char[] s_str= s.toCharArray();
        char[] t_str= t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s_str[i]!='#') {
             s_str[slow]=s_str[i];
             slow++;
            }else{
                if (slow>0) {
                    slow--;
                }
            }
        }
        int slow1=0;
        for (int i = 0; i < t.length(); i++) {
            if (t_str[i]!='#') {
             t_str[slow1]=t_str[i];
             slow1++;
            }else{
                if (slow1>0) {
                    slow1--;
                }
            }
        }

        return String.valueOf(s_str).substring(0, slow).equals(String.valueOf(t_str).substring(0, slow1));


    }
}
// @lc code=end

