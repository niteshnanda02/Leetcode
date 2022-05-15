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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        int res=0;
        
        while(!queue.isEmpty()){
            res=0;
            for(int i=queue.size()-1;i>=0;i--){
                TreeNode rv = queue.remove();
                res+=rv.val;
                if(rv.left!=null)
                    queue.add(rv.left);
                if(rv.right!=null)
                    queue.add(rv.right);
            }
        }
        
        return res;
    }
}