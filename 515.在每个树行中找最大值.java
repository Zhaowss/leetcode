/*
 * @lc app=leetcode.cn id=515 lang=java
 *
 * [515] 在每个树行中找最大值
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

    public  List<Integer> aList=new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {


        if (root==null) {
            return aList;
        }
        Deque<TreeNode> aDeque=new LinkedList<>();
        aDeque.offer(root);
        while (!aDeque.isEmpty()) {

            int len=aDeque.size();

            int max=Integer.MIN_VALUE;
            while (len>0) {      
                root=aDeque.pop();
                if (root.val>max) {
                    max=root.val;}
                if (root.left!=null) {
                    aDeque.offer(root.left);
                }
                if (root.right!=null) {
                    aDeque.offer(root.right); 
                }
                len--;
            }
            aList.add(max);
        }
        return aList;
    }
}
// @lc code=end

