/*
 * @lc app=leetcode.cn id=567 lang=java
 *
 * [567] 字符串的排列
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // 首先分析此意，其实就是说S1是s2的子字符串

        HashMap<Character,Integer> myhashmap=new HashMap<>();
        HashMap<Character,Integer> windowHashMap=new HashMap<>();
        for (char s : s1.toCharArray()) {
         myhashmap.put(s,myhashmap.getOrDefault(s,0)+1);
        }
        // 完成目标的哈希表的构建之后

        int left=0,right=0,val=0;
        while (right<s2.length()) {
            // 滑动窗口的右边界 
            char x=s2.charAt(right);
            right++;

            // 搜索可行的解
            // 该数值包含在目标值之中
            if(myhashmap.containsKey(x)){
                windowHashMap.put(x, windowHashMap.getOrDefault(x, 0)+1);
                if(windowHashMap.get(x).equals(myhashmap.get(x))){
                    val++;
                }
            } 
            // 搜索最优的结果
            while (right-left>=s1.length()) {   

            //  System.out.println(myhashmap.size());
            //  System.out.println(s1.length());
             if (val==myhashmap.size()) {
                return true;
             }

             char sz=s2.charAt(left);
             left++;
             if (myhashmap.containsKey(sz)) {
                if (myhashmap.get(sz).equals(windowHashMap.get(sz))) 
                      val--;
                windowHashMap.put(sz, windowHashMap.getOrDefault(sz, 0)-1);
             }
        }
    }
     return false;


    }
}
// @lc code=end

