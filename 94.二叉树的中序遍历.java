/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
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
       
        List<Integer> arr=new ArrayList<>();
        Deque<TreeNode> aDeque=new LinkedList<>();
        while (root!=null || !aDeque.isEmpty()) {

            if (root!=null) {
                aDeque.push(root);
                root=root.left;
            }else{
                root=aDeque.pop();
                arr.add(root.val);
                root=root.right;
            }
            
        }
        return arr;
    }
    //     FindTreeValue(root, myarr);
    //     return myarr;

    // }
    // public void FindTreeValue(TreeNode root,List<Integer> myarr){
    //    if (root==null) {
    //     return ;
    //    }

    //    FindTreeValue(root.left, myarr);
    //    myarr.add(root.val);
    //    FindTreeValue(root.right, myarr);
    // }
}
// @lc code=end

