/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根 
 */

// @lc code=start



// class Solution {
//     public int mySqrt(int x) {
//         int l=1;
//         int right =x;
//         int ans=-1;
//         if (x==0) {
//             return 0;
//         }
    
//        while(l<=right){
//         int  middle=l+(right-l)/2;
//     //   特别注意这个需要将乘法处理成除法继而防止溢出。
//         if (middle<=x/middle) {
//              ans=middle;
//              l=middle+1;
//         }else{
//              right=middle-1;
//         }
//        }
//        return ans;
//     }
// }




class Solution {
    public int mySqrt(int x) {
      int left=1,right=x,ans=-1;
      if (x==0) {
        return 0;
      }
      while (left<=right) {
        // 计算中间的数值
        int mid=left+(right-left)/2;
        if (mid>x/mid) {
            // 如果是大于当前的数值，则将其右边界-1
            right=mid-1;
        }else
        { 
            //如果是小于当前的数值，记录当前的结果，并将其左边界+1
            ans=mid;
            // 这个mid记录的是最后一次记录的小于当前dex的那个
            left=left+1;
        }
       
      }
      return ans;
    }
}
// @lc code=end

