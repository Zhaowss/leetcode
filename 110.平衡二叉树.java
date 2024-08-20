/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */

// @lc code=start


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
     return countnum(root)==-1? false:true;
    }
  

    public static Integer countnum(TreeNode treeNode){
        if (treeNode==null) {
            return 0;
        }
       int numleft=countnum(treeNode.left);
       if (numleft==-1) {
        return -1;
       }
       int numright=countnum(treeNode.right);
       if (numright==-1) {
        return -1;
       }
       return Math.abs(numleft-numright)>1? -1:1+Math.max(numleft, numright);
    }
}
// @lc code=end

