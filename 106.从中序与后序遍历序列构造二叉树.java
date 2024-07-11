/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
 */

// @lc code=start

import java.util.HashMap;

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
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        for (int i = 0; i < inorder.length; i++) {
        map.put(inorder[i], i);
        }
        return Build_mb_tree( inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }


    public  TreeNode Build_mb_tree(int[] inorder,int begin,int end,int[] postorder,int rbegin,int rend){
        
        if (begin>end) {
         return null;
        }

        int value=postorder[rend];
        int index=map.get(value);

        TreeNode root=new TreeNode(value);
        root.left=Build_mb_tree(inorder, begin, index-1, postorder, rbegin, rend-(end-index)-1);
        root.right=Build_mb_tree(inorder, index+1, end, postorder, rend-(end-index), rend-1);
        return root;
    }

}
// @lc code=end

