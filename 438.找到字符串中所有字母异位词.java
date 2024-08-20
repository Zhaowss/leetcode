/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] s1=s.toCharArray();
        char[] p1=p.toCharArray();
        HashMap<Character,Integer> window=new HashMap<Character,Integer>();
        HashMap<Character,Integer> need=new HashMap<Character,Integer>();
        for (char c : p1) {
            need.put(c, need.getOrDefault(c, 0)+1);
        }

        int left=0,valid=0;
        ArrayList<Integer> alArrayList=new ArrayList<>();

        for (int right = 0; right < s1.length; right++) {

            // 添加元素
            char cs=s1[right];
            if (need.containsKey(cs)) {
                window.put(cs,window.getOrDefault(cs,0)+1);
                if (window.get(cs).equals(need.get(cs))) {
                    valid++;
                }
            } 
            while (valid==need.size()) {
                if (right-left+1==p.length()) {
                    alArrayList.add(left);
                }

                if (need.containsKey(s1[left])) {
                    
                    if (need.get(s1[left]).equals(window.get(s1[left]))) {
                        valid--;
                    }
                    window.put(s1[left],window.get(s1[left])-1);
                }
                left++;
            }
            
        }

        return alArrayList;





   
    }
}
// @lc code=end

