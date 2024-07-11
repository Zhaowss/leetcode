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
        int l=1;
        int right =x;
        int ans=-1;
        if (x==0) {
            return 0;
        }
        if (x==1) {
            return 1;
        }
        while (l<right) {    
            int mid=l+(right-l)/2;
            if (mid>x/mid) {
             right=mid;   
            }else if(mid<=x/mid){
             ans=mid;
             l=mid+1;
            }
        }
        return  ans;
    
    }
}
// @lc code=end

