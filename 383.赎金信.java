/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.print.DocFlavor.CHAR_ARRAY;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] rs=ransomNote.toCharArray();
        char[] ms=magazine.toCharArray();
        int val=0;
        HashMap<Character,Integer> hs1=new HashMap<Character,Integer>();
        HashMap<Character,Integer> hs2=new HashMap<Character,Integer>();
        for (char c : rs) {
            hs1.put(c, hs1.getOrDefault(c, 0)+1);
        }
        for (char c : ms) {
            hs2.put(c, hs2.getOrDefault(c, 0)+1);
        }

        Collection<Character> sc= hs1.keySet();
        for (Character character : sc) {
            if (hs2.containsKey(character)&& hs2.get(character)>=hs1.get(character)) {
                val++;
            }
        }
        if (val==hs1.size()) {
            return true;
        }
        return false;
    }
}
// @lc code=end

