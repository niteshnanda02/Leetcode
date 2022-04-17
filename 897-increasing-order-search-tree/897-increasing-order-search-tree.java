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
    TreeNode head, tail;
    public TreeNode increasingBST(TreeNode root) {
        head=null; tail=null;
        inorder(root);
        
        return head;
    }
    
    void inorder(TreeNode node){
        // base condition
        if(node==null)
            return;
        // LDR
        inorder(node.left);
        
        // processing over data
        TreeNode nn = new TreeNode(node.val);
        if(head==null){
            head=nn;
            tail=nn;
        }else{
            tail.right=nn;
            tail=nn;
        }
        
        inorder(node.right);
    }
}