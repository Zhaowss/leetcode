/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start


class Solution {
    public boolean isPerfectSquare(int num) {
        int left=1;
        int right=num;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if (mid==num/mid && num%mid==0) {
            //当平方相等且，对其中值取余为0的时候返回true
                return true;
            } else if (mid>num/mid) {
                right=mid-1;
            }else{
                left=left+1;
            }
        }

        return false;
    }
}
// @lc code=end

