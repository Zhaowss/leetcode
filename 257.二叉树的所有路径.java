/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
 */

// @lc code=start

import java.util.ArrayList;

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
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> paths=new ArrayList<String>();

        if (root==null) {
            return paths;
        }
       List<Integer> paths_temp=new ArrayList<Integer>();
       transval(root, paths_temp, paths);
       return paths;
    }

    public static void transval(TreeNode root,List<Integer> paths_temp,List<String> paths){
        paths_temp.add(root.val);
        if (root.left==null && root.right==null) {
           StringBuilder stringBuilder=new StringBuilder();

           for (int i = 0; i < paths_temp.size()-1; i++) {
            stringBuilder.append(paths_temp.get(i)).append("->");
           }
           stringBuilder.append(paths_temp.get(paths_temp.size()-1));
           paths.add(stringBuilder.toString());
           return;
        }
        if (root.left!=null) {
            transval(root.left, paths_temp, paths);
            paths_temp.remove(paths_temp.size() - 1);// 回溯
        }
        if (root.right!=null) {
            transval(root.right, paths_temp, paths);
            paths_temp.remove(paths_temp.size() - 1);// 回溯
        }
    }
}
// @lc code=end

