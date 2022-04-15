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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        // base condition
        if(root==null)
            return null;
        
        // root is in the range
        if(root.val>=low&&root.val<=high){
            root.left = trimBST(root.left, low, high);
            root.right=trimBST(root.right, low, high);
        }
        // it does not make sense to search in left part, so will search only in right part
        else if(root.val<low){
            root = trimBST(root.right, low, high);
        }else{
            root = trimBST(root.left, low, high);
        }
        
        return root;
    }
}