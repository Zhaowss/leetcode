/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        // 不能定义新的数组，必然使用双指针去处理交换即可。
        int left=0;
        int right=s.length-1;
        while (left<right) {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }


    }
}
// @lc code=end

