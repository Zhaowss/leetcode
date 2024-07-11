/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
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

    public void flatten(TreeNode root) {
    if (root==null) {
        return;
    }
     tranverse(root);
    }

    public static void tranverse(TreeNode root){
        if (root==null) {
            return;
        }

        tranverse(root.left);
        tranverse(root.right);
        TreeNode left=root.left;
        TreeNode right=root.right;
        // 后序遍历的操作，相当于已经是展平的操作了
        root.left=null;
        root.right=left;
        TreeNode p=root;

        while (p.right!=null) {
            p=p.right;
        }
        p.right=right;
    }
}
// @lc code=end

