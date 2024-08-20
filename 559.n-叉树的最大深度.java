/*
 * @lc app=leetcode.cn id=559 lang=java
 *
 * [559] N 叉树的最大深度
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    // public int maxDepth(Node root) {
    //    if (root==null) {
    //     return 0;
    //    }
    //    int maxDepth_value=0;
    //    for(Node cur:root.children){ 
    //       maxDepth_value=Math.max(maxDepth(cur), maxDepth_value);
    //     //   求出每一个节点当前的最大的子节点的深度
    //    }
    //    //进而确定出当前的节点的最大的深度
    //   return 1+maxDepth_value; 
    // }

// 广度优先 即也就是使用层序遍历实现
    public int maxDepth(Node root) {
        if (root==null) {
         return 0;
        }
        // 定义层序遍历的栈
        Deque<Node> deque=new LinkedList<>();
        deque.offer(root);
        int ans=0;

        while (!deque.isEmpty()) {
            int len=deque.size();
            while (len>0) {

                Node cur=deque.pop();

                if (cur.children!=null) {
                    for (Node  object : cur.children) {
                        deque.offer(object);
                    }  
                }
                len--;
            }
            ans++;     
        }

        return ans;
       
     }
}
// @lc code=end

