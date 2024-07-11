/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> myarr=new ArrayList();
        return FindTreeValue(root,myarr);

    }
    public List<Integer>  FindTreeValue(TreeNode root,List myarr){
        if(root==null){
           return myarr;
        }
        FindTreeValue(root.left,myarr);
        myarr.add(root.val);
        FindTreeValue(root.right,myarr);
        return myarr;
    }
}
// @lc code=end

