/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i : nums) {
            hashMap.put(i, hashMap.getOrDefault(i,0)+1);
        }
          // 使用哈希表进行频次的统计
          //大顶堆,即也就是按照从大到小的顺序排序，因此出队列的时候只需要弹出前K个
        PriorityQueue<int[]> paPriorityQueue=new PriorityQueue<>((p1,p2)->{
            return p2[1]-p1[1];
        });
       
      for (Map.Entry<Integer,Integer> entry :  hashMap.entrySet()) {
        paPriorityQueue.add(new int[]{entry.getKey(),entry.getValue()});
      };      
      int[] res=new int[k];

      for (int i = 0; i < k; i++) {
        res[i]=paPriorityQueue.poll()[0];
      }
    return res;

        }
}
// @lc code=end

