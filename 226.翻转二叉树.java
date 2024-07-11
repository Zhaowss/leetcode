/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
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
// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         tranverse(root);
//         return root;

//     }
//     public static void tranverse(TreeNode root){
//         if (root==null) {
//             return;
//         }
//         tranverse(root.left);
//         tranverse(root.right);
//         TreeNode temp=root.left;
//         root.left=root.right;
//         root.right=temp;
//     }
// }
// 解法2
class Solution {
    public TreeNode invertTree(TreeNode root) {
        tranverse(root);
        return root;

    }
// 定义问题 就是 
    public static TreeNode tranverse(TreeNode root){
        if (root==null) {
            return null;
        }
        TreeNode left_node=tranverse(root.left);
        TreeNode right_node =tranverse(root.right);
        root.left=right_node;
        root.right=left_node;
        return root;
    }
}


// @lc code=end

