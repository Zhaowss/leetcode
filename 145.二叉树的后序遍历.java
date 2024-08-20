/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
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
        List<Integer> arr=new ArrayList<>();


        Deque<TreeNode>  deque=new LinkedList<>();
        deque.push(root);
        if (root==null) {
            return arr;
        }
        // 出栈的顺序是 左 右 中
        // 入栈的顺序是 中 右 左

        while (!deque.isEmpty()) {

            root=deque.pop();
            arr.add(root.val);    
            if (root.left!=null) {
                deque.push(root.left);
            }
            if (root.right!=null) {
                deque.add(root.right);
            }
            //按照这情况 出栈的时候为 中右左
        }
        Collections.reverse(arr);
        return arr;
    }
    //     gainList(root,nList);
    //     return nList;
    // }
    // public static void gainList(TreeNode root,List<Integer> list)
    // {

    //     if (root==null) {
    //         return ;
    //     }
        
    //     gainList(root.left, list);
    //     gainList(root.right, list);
    //     list.add(root.val);
    // }
}
// @lc code=end

