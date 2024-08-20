/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        int left=0;//定义左指针
        int slqp=Integer.MAX_VALUE;
        int begin=0;
        int falg=0;
        // 定义窗口和need窗口
        HashMap<Character,Integer> window= new HashMap<>();
        HashMap<Character,Integer> need= new HashMap<>();
        for (char charArray : t.toCharArray()) {
           need.put(charArray, need.getOrDefault(charArray, 0)+1); 
        }


        for (int right = 0; right < s.length(); right++) {

            char target=s.charAt(right);

            window.put(target, window.getOrDefault(target, 0)+1);
            if (need.containsKey(target)) {
                if (need.get(target).equals(window.get(target))) {
                    falg++;
                }
            }
            // 也就是符合子串中含有目标中的所有的元素
            while (falg==need.size()) {
                if (slqp>right-left+1) {
                    begin=left;
                    slqp=Math.min(slqp,right-left+1);  
                }
                if (need.containsKey(s.charAt(left))) {
                    if (need.get(s.charAt(left)).equals(window.get(s.charAt(left)))) {
                        falg--;
                    }
                }
                window.put(s.charAt(left),window.get(s.charAt(left))-1);
                left++;
            }
        }

        if (slqp==Integer.MAX_VALUE) {
            return String.valueOf("");
            
        }
        return s.substring(begin, begin+slqp);
}
}
// @lc code=end

