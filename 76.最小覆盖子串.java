/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start

import java.util.HashMap;

class Solution {

    
    public static String minWindow(String s, String t) {
        // 首先作为一个定义目标的哈希表和窗口哈希表
        HashMap<Character,Integer> myhashmap=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        for (char c : t.toCharArray()) myhashmap.put(c, myhashmap.getOrDefault(c, 0) + 1);
        // 将目标的字符串存入hashmap中
        int right=0,left=0;
        int min_len=Integer.MAX_VALUE;
        // 最小字串开始的索引位置
        int start=0;
        // 利用Val存储三个条件是否都满足
        int val=0;
        while(right<s.length()){  
        // 首先不断增大窗口的右边的边界使其能够包含我的目的输入
        char c=s.charAt(right);
        right++;


        // 寻找可行解
        if (myhashmap.containsKey(c)) {
            window.put(c, window.getOrDefault(c, 0)+1);
            if(window.get(c).equals(myhashmap.get(c))){
                val++;
            }
        }


       // 优化可行解
        while (val==myhashmap.size()) {
            // 滑动窗口条件满足，更新起始的位置和目标的最短长度字符串的
            if (right-left<min_len) {

                start=left;
                min_len=right-left;

            }
           


            char cc=s.charAt(left);

            left++;
            // 收缩左边界，同时更新我们的窗口的数据
            // 如果去除的边界是包含在我们的目的的字符中的
            if (myhashmap.containsKey(cc)) {
                // 如果该字符串和要求的字符串中出现的次数相同，则将val--，同时将出现的次数减去1
                if (window.get(cc).equals(myhashmap.get(cc))) {
                    val--;
                }
                window.put(cc,window.getOrDefault(cc, 0)-1);
                
            }

        }


        }

        return min_len==Integer.MAX_VALUE? "":s.substring(start, start+min_len);


     

}
}
// @lc code=end

