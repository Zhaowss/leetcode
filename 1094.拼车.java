/*
 * @lc app=leetcode.cn id=1094 lang=java
 *
 * [1094] 拼车
 */

// @lc code=start
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {


        // 典型的差分数组的问题求解，考虑到区间内的元素的处理，数组一般默认使用差分数组

        int max=0;

        for (int i = 0; i < trips.length; i++) {
          max=Math.max(max, trips[i][2]);
        }
        // 如何实现？
        int[] diffsum=new int[max+1];
        for (int i = 0; i < trips.length; i++) {
           int value=trips[i][0];
           int m=trips[i][1];
           int n=trips[i][2];
           diffsum[m]=diffsum[m]+value;
           if (n<max+1) {
            diffsum[n]=diffsum[n]-value;
           }  
        }

        int[] sum=new int[max+1];
        sum[0]=diffsum[0];
        if (sum[0]>capacity) {
            return false;
        }
        for (int i = 1; i < diffsum.length; i++) {
            sum[i]=diffsum[i]+sum[i-1];
            if (sum[i]>capacity) {
                return false;
            }
        }
        return true;     

    }
}
// @lc code=end

