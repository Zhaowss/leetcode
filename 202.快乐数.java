/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        while (true) {
            int sum=0;
            while (n>0) {
                sum+=(n%10)*(n%10);
                n= n/10;
            }
            if (sum==1) {
                return true;
            }
            if (hs.contains(sum)) {
                return false;
            }else
            {
                hs.add(sum);
            } 
            n=sum;
        }


    }
}
// @lc code=end

