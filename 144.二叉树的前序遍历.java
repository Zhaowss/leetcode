/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// import javax.swing.tree.TreeNode;


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

        //利用栈去模拟递归实现；
        //中 左 右
        //入栈： 中 右  左 
        //出栈  中 左  右

        Deque<TreeNode>  deque=new LinkedList<>();
        deque.push(root);
        if (root==null) {
            return arr;
        }

        while (!deque.isEmpty()) {

           TreeNode root1= deque.pop();
           arr.add(root1.val);

           if (root1.right!=null) {
            deque.push(root1.right);
           }
           if (root1.left!=null) {
            deque.push(root1.left);
           }    
        }
        return arr;





        // 利用递归的方法去实现
        // gainlist(root,arr);
        // return arr;、
    }
    
    // public static void gainlist(TreeNode cur,List<Integer> list)
    // {
    //   if (cur==null) {
    //     return;
    //   }
    //   list.add(cur.val);
    //   gainlist(cur.left, list);
    //   gainlist(cur.right, list);
    // }
}
// @lc code=end

