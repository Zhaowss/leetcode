/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
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
    int maxlength=0;
    public int diameterOfBinaryTree(TreeNode root) {
      tranverse(root);
      return maxlength;
    }

//    求出该节点下面的最大的节点路径
    public int  tranverse(TreeNode root){
        if (root==null) {
            return 0;
        }

        int maxLeft=tranverse(root.left);
        int maxRight=tranverse(root.right);
        int maxvalue=maxLeft+maxRight;
        maxlength=Math.max(maxlength, maxvalue);
        return 1+Math.max(maxRight, maxLeft);
    }
}
// @lc code=end

