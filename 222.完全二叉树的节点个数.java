/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
 */

// @lc code=start

import java.util.Deque;
import java.util.LinkedList;



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
    // public int countNodes(TreeNode root) {
    //     if (root==null) {
    //         return 0;
    //     }
    //     int leftnum=countNodes(root.left);
    //     int rightnum=countNodes(root.right);
    //     return leftnum+rightnum+1;
    // }

    public int countNodes(TreeNode root) {
        if (root==null) {
            return 0;
        }
        
        Deque<TreeNode> deque=new LinkedList<>();
        deque.offer(root);
        int ans=0;
        while (!deque.isEmpty()) {
            int size=deque.size();

           for (int i = size; i>0; i--) {

            root=deque.pop();
            ans++;

            if (root.left!=null) {
                deque.offer(root.left);
            }
            if (root.right!=null) {
                deque.offer(root.right);
            }          
           }          
       }
        return ans;
    }
}
// @lc code=end

