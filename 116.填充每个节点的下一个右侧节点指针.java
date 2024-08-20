/*
 * @lc app=leetcode.cn id=116 lang=java
 *
 * [116] 填充每个节点的下一个右侧节点指针
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

import java.util.Deque;
import java.util.LinkedList;
 


class Solution {
    public Node connect(Node root) {
    Node ans=root;
    if (root==null) {
        return null;
    }
    // 本质层序遍历，然后将其里面的每个节点指向其对应层中的下一个节点
    Deque<Node> aDeque=new LinkedList<>();
    aDeque.offer(root);
    Node pre=null;
    while (!aDeque.isEmpty()) {
        int len=aDeque.size();
        while (len>0) {
            root=aDeque.pop();
            if (pre!=null) {
                pre.next=root;   
            }
    
            if (root.left!=null) {
                aDeque.offer(root.left);
            }
    
            if (root.right!=null) {
                aDeque.offer(root.right);
            }
            len--;
            if (len==0) {
                root.next=null;
                pre=null;
    
            }else{
                pre=root;
            }           
        }
    }

    return ans;

}
}
// @lc code=end

