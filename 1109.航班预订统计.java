/*
 * @lc app=leetcode.cn id=1109 lang=java
 *
 * [1109] 航班预订统计
 */

// @lc code=start
// class Solution {
//     public int[] corpFlightBookings(int[][] bookings, int n) {
       

//         int[] sum=new int[n];

//         for (int i = 0; i < bookings.length; i++) {  
//         int m=bookings[i][0]-1;
//         int x=bookings[i][1]-1;
//         int value=bookings[i][2];
//         for (int j = m; j <= x; j++) {
//             sum[j]=sum[j]+value;
//         }
//         }
  
//         return sum;
//     }
// }



class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
       

        int[] diffsum=new int[n];

        for (int i = 0; i < bookings.length; i++) {  
        int m=bookings[i][0]-1;
        int x=bookings[i][1]-1;
        int value=bookings[i][2];
        diffsum[m]=diffsum[m]+value;
        if(x+1<n){
        diffsum[x+1]=diffsum[x+1]-value;
        }
        }

        int[] sum=new int[n];
        sum[0]=diffsum[0];
        for (int i = 1; i < diffsum.length; i++) {
            sum[i]=diffsum[i]+sum[i-1];
        }
  
        return sum;
    }
}
// @lc code=end

