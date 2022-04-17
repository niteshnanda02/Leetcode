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
    TreeNode head=null, tail=null;
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return head;
    }
    
    void inorder(TreeNode node){
        if(node==null)
            return;
        inorder(node.left);
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