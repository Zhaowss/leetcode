/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        gainList(root,arr);
        return arr;
    }
    public static TreeNode  gainList(TreeNode root,List aList){
       if (root==null) {
        return null;
       } 
       aList.add(root.val);
       gainList(root.left, aList);
       gainList(root.right, aList);
       return root;
    }
}
// @lc code=end

