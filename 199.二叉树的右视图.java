/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
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

    public List<Integer> aList=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
    
        if (root==null) {
            return aList;
        }
        Deque<TreeNode> aDeque=new LinkedList<>();
        aDeque.offer(root);
        //也就是我们的每一层只需要pop最后一个元素即可
       
        while (!aDeque.isEmpty()) {
            ArrayList<Integer> arrayList=new ArrayList<>();
            int len=aDeque.size();
            int temp=len;
           
            while (len>0) {
                root=aDeque.pop();
                arrayList.add(root.val);
                if (root.left!=null) {
                    aDeque.offer(root.left);
                }
                if (root.right!=null) {
                    aDeque.offer(root.right);
                }
                len--;
            }
            aList.add(arrayList.get(temp-1));  
        }
        return aList;
    }
}
// @lc code=end

