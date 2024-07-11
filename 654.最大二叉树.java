/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
 */

// @lc code=start

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
// class Solution {
//     public TreeNode constructMaximumBinaryTree(int[] nums) {
//         return GainNode(nums,0,nums.length-1);
//     }

//     public TreeNode GainNode(int[] nums,int begin,int end){
//         if (begin>end) {
//             return null;
//         }
//         int max_index=findMaxnodeValue(nums,begin,end);
//         TreeNode myNode=new TreeNode(nums[max_index]);
//         myNode.left=GainNode(nums, begin, max_index-1);
//         myNode.right=GainNode(nums, max_index+1, end);
//         return myNode;
//     }


//     public static int findMaxnodeValue(int[] nums,int left,int right ){
//         int max_dex=left;
//         for (int i = left; i <=right; i++) {
//          max_dex=nums[max_dex]<=nums[i]? i:max_dex;   
//         }
//         return max_dex;
//     }


// }





class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return gainTwoTree(nums,0,nums.length-1);
    }

    public TreeNode gainTwoTree(int[] nums,int begin,int end){



        if (begin>end) {
            return null;
        }
        int max_index=findMaxnodeValue(nums, begin, end);
        TreeNode mynode=new TreeNode(nums[max_index]);
        mynode.left=gainTwoTree(nums, begin, max_index-1);
        mynode.right=gainTwoTree(nums, max_index+1, end);
        return mynode;

    }

    public int findMaxnodeValue(int[] nums,int begin,int end){
        int max_index=begin;
        for (int i = begin; i <= end; i++) {
         max_index=nums[i]>nums[max_index]? i:max_index;
        }
        return max_index;
    }



}




// @lc code=end

