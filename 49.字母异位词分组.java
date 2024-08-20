/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> res=new HashMap<>();
    for (String string : strs) {
        char[] rz=string.toCharArray();
        Arrays.sort(rz);
        List<String> aList=res.getOrDefault(String.valueOf(rz),new ArrayList<String>());
        aList.add(string);
        res.put(String.valueOf(rz), aList);
    } 
    return new ArrayList<>(res.values());
}
}
// @lc code=end

