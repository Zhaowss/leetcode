/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List nList=new ArrayList<>();
        gainList(root,nList);
        return nList;
    }
    public List gainList(TreeNode root,List<Integer> aList){
        if (root==null) {
            return null;
        }
        gainList(root.left, aList);
        gainList(root.right, aList);
        aList.add(root.val);
        return aList;
    }
}
// @lc code=end

