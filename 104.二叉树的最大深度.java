/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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
//     int Depth=0;
//     int res=0;
//     public int maxDepth(TreeNode root) {

//         Tranvse(root);
//         return res;
    
//     }


//     // 遍历每一个节点，返回每个节点的最大的深度

//     public void Tranvse(TreeNode root){
//         if (root==null ) {
//             return;
        
//         }
//         // 前序遍历的操作
//         Depth++;
//         res=Math.max(res, Depth);
//         int leftmax=maxDepth(root.left);
//         int rightmax=maxDepth(root.right);
//         Depth--;
//     }
// }
// 解法2
class Solution {

    public int maxDepth(TreeNode root) {

       return  Tranvse(root);
       
    
    }


    // 后序遍历每一个节点，返回每个节点的最大的深度
    // 后序遍历一个节点。得到该节点上的最大深度。
    public int Tranvse(TreeNode root){
        if (root==null ) {
            return 0;
        
        }
        int leftmax=maxDepth(root.left);
        int rightmax=maxDepth(root.right);
        // h后序的操作，其实就是定义一个问题
        return 1+Math.max(leftmax, rightmax);
    }
}
// @lc code=end

