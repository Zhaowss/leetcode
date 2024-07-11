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
    HashMap<Character,Integer> myHashMap=new HashMap<>();
    HashMap<Character,Integer> windowHashMap=new HashMap<>();
    for (char x : p.toCharArray()) {
        myHashMap.put(x, myHashMap.getOrDefault(x, 0)+1);
    }
    List<Integer> mList=new ArrayList<>();
    int right=0,left=0,val=0;

    while (right<s.length()) {
        // 首先窗口右边接受数据
        char c=s.charAt(right);
        right++;
        // 寻找可行解
        if (myHashMap.containsKey(c)) {
            windowHashMap.put(c, windowHashMap.getOrDefault(c, 0)+1);
            if (windowHashMap.get(c).equals(myHashMap.get(c))) {
                val++;
            }
        }
        // 设置优化的循环判断条件
        while(right-left>=p.length()){
            if (val==myHashMap.size()) {
                mList.add(left);
            }
            char o=s.charAt(left);
            left++;
            if (myHashMap.containsKey(o)) {
                if (myHashMap.get(o).equals(windowHashMap.get(o))) {
                    val--;
                }
                windowHashMap.put(o, windowHashMap.getOrDefault(o,0)-1);
            }
        }
    }

    return mList;
    }
}
// @lc code=end

