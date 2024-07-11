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
            int middle=left+(right-left)/2;
            if (middle==num/middle) {
                // 整形的计算可能有舍去误差因此在重新校验一遍
                if(middle*middle==num)
                {return true;}
                else{
                    left=middle+1;
                }
            }else if (middle>num/middle) {
                right=middle-1;
            }else if(middle<num/middle){
                left=middle+1;
            }
         }


         return false;

    }
}
// @lc code=end

