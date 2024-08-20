/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层序遍历 II
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

    public List<List<Integer>> aList=new ArrayList<>(new ArrayList<>());
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Deque<TreeNode> aDeque=new LinkedList<>();

        if (root==null) {
            return aList;
        }
        aDeque.offer(root);

    
        while (!aDeque.isEmpty()) {

            ArrayList<Integer> arrayList=new ArrayList<>();

            int len=aDeque.size();


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
            aList.add(arrayList);
            
        }
        Collections.reverse(aList);
        return aList;
    }
}
// @lc code=end

