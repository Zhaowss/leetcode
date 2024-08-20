/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    // public boolean isAnagram(String s, String t) {
    //     char[] str=s.toCharArray();
    //     char[] ttr=t.toCharArray();
    //     Arrays.sort(str);
    //     Arrays.sort(ttr);
    //     String ss1=String.valueOf(str);
    //     String ss2=String.valueOf(ttr);
    //     if (ss1.equals(ss2)) {
    //         return true;
    //     }
    //     return false;
    // }

    public boolean isAnagram(String s, String t) {
        char[] str=s.toCharArray();
        char[] ttr=t.toCharArray();
        HashMap<Character,Integer> hash1=new HashMap<Character,Integer>();
        HashMap<Character,Integer> hash2=new HashMap<Character,Integer>();
        for (char c : str) {
            hash1.put(c,hash1.getOrDefault(c, 0)+1);
        }
        for (char c : ttr) {
            hash2.put(c,hash2.getOrDefault(c, 0)+1);
        }
        if (hash1.equals(hash2)) {
            return true;
        }

        return false;

    }
}
// @lc code=end

