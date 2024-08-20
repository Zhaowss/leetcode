/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> num1=new HashMap<>();
        HashMap<Integer,Integer> num2=new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            num1.put(nums1[i],num1.getOrDefault(nums1[i], 0)+1);
        }
        ArrayList<Integer> ahList=new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (num1.containsKey(nums2[i])) {
                num2.put(nums2[i], num2.getOrDefault(nums2[i],0)+1);
                // 将其属于这个num1中的放入，并判断是否放入的次数已经达到num1中的次数
                if (num2.get(nums2[i])<=(num1.get(nums2[i]))) {
                    //满足放入的条件，将其放入我们的list中
                    ahList.add(nums2[i]);
                }
            }
        }
      int[] ss=new int[ahList.size()];
      int j=0;
      for (Integer ch : ahList) {
        ss[j++]=ch;
      }


      return ss;


    }
}
// @lc code=end

