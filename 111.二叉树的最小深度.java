/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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

//  层序遍历的方法去解决
class Solution {
    int min=Integer.MAX_VALUE;
    // public int minDepth(TreeNode root) {
    //     if (root == null) {
    //         return 0;
    //     }
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.offer(root);
    //     int depth = 0;
    //     while (!queue.isEmpty()){
    //         int size = queue.size();
    //         depth++;
    //         //每次进入一层九在当前的层上进行处理depth++
    //         TreeNode cur = null;
    //         for (int i = 0; i < size; i++) {
    //             cur = queue.poll();
    //             //如果当前节点的左右孩子都为空，直接返回最小深度
    //             if (cur.left == null && cur.right == null){
    //                 return depth;
    //             }
    //             if (cur.left != null) queue.offer(cur.left);
    //             if (cur.right != null) queue.offer(cur.right);
    //         }
    //     }
    //     return depth;
    // }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int minleft=minDepth(root.left);
        int minright=minDepth(root.right);

//      当单个子节点为空的时候我们不能将其空节点和另外的子节点进行min的操作
        if (root.left==null && root.right !=null) {
            return 1+minright;
        }
        if (root.right==null && root.left !=null) {
            return 1+minleft;
        }
        // 返回这个的时候，其应该为左右都为空，或者是左右都不为空
        return 1+Math.min(minleft, minright);
    }
   
}

// @lc code=end

