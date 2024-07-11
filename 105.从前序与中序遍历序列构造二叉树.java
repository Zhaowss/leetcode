/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
    HashMap<Integer,Integer>  myset=new HashMap();
    public TreeNode buildTree(int[] preorder, int[] inorder) {

    for (int i = 0; i < inorder.length; i++) {
        myset.put(inorder[i], i);
    }

    return build_f_m_build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    public TreeNode build_f_m_build(int[] preorder,int begin,int end,int[] inorder, int rbegin,int lend){
    
        if (begin>end) {
            return null;
        }
        int value=preorder[begin];
        int inorder_index=myset.get(value);

        TreeNode root=new TreeNode(value);
        root.left=build_f_m_build(preorder, begin+1, begin+inorder_index-rbegin, inorder, rbegin, inorder_index-1);
        root.right=build_f_m_build(preorder, begin+inorder_index-rbegin+1, end, inorder, inorder_index+1, lend);
        return root;


    }
}
// @lc code=end

